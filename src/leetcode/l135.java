package leetcode;

import java.util.Arrays;

public class l135 {
    public static int candy(int[] ratings) {
        int result = 0;
        int[] candys = new int[ratings.length];
        Arrays.fill(candys,1);
        for (int i = 0; i < ratings.length-1; i++) {
            if(ratings[i]<ratings[i+1]) {
                candys[i+1] = candys[i] + 1;
            }
        }
        for (int i = ratings.length - 1; i >= 1; i--) {
            if (ratings[i-1]>ratings[i] && candys[i-1] <= candys[i]) {
                candys[i-1] = candys[i] + 1;
            }
        }
        for (int candy : candys) {
            result += candy;
            System.out.println(candy);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = candy(new int[]{1,3,4,5,2});
        System.out.println(result);
    }
}

/*
两次遍历：
法1：
把所有孩子的糖果数初始化为 1； 先从左往右遍历一遍，如果右边孩子的评分比左边的高，则右边孩子的糖果数更新为左边孩子的 糖果数加 1；
再从右往左遍历一遍，如果左边孩子的评分比右边的高，且左边孩子当前的糖果数 不大于右边孩子的糖果数，则左边孩子的糖果数更新为右边孩子的糖果数加 1。

法2：
两个数组left和right，分别两次遍历，
最终，取以上2轮遍历 left 和 right 对应学生糖果数的最大值 ，这样则同时满足左规则和右规则 ，即得到每个同学的最少糖果数量

*/
