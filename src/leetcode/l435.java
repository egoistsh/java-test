package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class l435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length ==0) return 0;

        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b) {
                return a[1] - b[1];
            }
        });

        int n = intervals.length;
        int right = intervals[0][1];
        int total = 0;
        for(int i = 1;i < n;i++) {
            if(intervals[i][0] < right) total++;
            else right = intervals[i][1];
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,4},{1,3}};
        int total = eraseOverlapIntervals(intervals);
        System.out.println(total);


    }
}


