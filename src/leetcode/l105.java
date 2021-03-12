package leetcode;

public class l105 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    public static TreeNode build(int[] preorder,int[] inorder,int p_from,int p_to,int i_from,int i_to) {
        if(p_from > p_to) return null;
        TreeNode root = new TreeNode(preorder[p_from]);
        int index = -1;
        for(int i = p_from;i <= p_to;i++) {
            if(preorder[p_from] == inorder[i]) {
                index = i;
                break;
            }
        }
        int leftNum = index - i_from;
        root.left = build(preorder,inorder,p_from+1,p_from+leftNum,i_from,index-1);
        root.right = build(preorder,inorder,p_from+leftNum+1,p_to,index+1,i_to);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder,inorder);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}