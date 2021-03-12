package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l930 {
        public static List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            int start = 0, end =0;
            for(int i = 0; i <= s.length();i++) {
                if(end == s.length()-1 || s.charAt(end) != s.charAt(end+1)) {
                    if(end - start >= 2) {
                        ret.add(Arrays.asList(start,end));
                    }
                    start = i;
                    end = i;
                } else {
                    end++;
                }
            }
            return ret;
        }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("babaaaabbb"));
    }
}
