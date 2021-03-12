package string;

public class KMP {
        public int strStr(String haystack, String needle) {
            char[] S = haystack.toCharArray();
            char[] T= needle.toCharArray();
            int[] next = get_next(needle);
            int i = 1;
            int j = 0;
            while(i<S.length && j<T.length){
                if (j==-1 || S[i] == T[j]) {
                    i++;
                    j++;
                }else{
                    j = next[j];
                }
            }
            if (j == T.length){
                return i-T.length;
            }else
                return -1;
        }

        public int[] get_next(String needle) {
            int i = 1;
            int j = 0;
            int[] next = new int[255];
            next[0] = -1;
            char[] str = needle.toCharArray();
            while(i < needle.length()) {
                if (j==-1 || str[i]==str[j]) {
                    i++;
                    j++;
                    next[i] = j;
                }else {
                    j = next[j];
                }
            }
            return next;
        }
}
