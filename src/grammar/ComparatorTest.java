package grammar;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Integer[] test = {5,2,4,1,3};
        Arrays.sort(test);//升序
        Arrays.sort(test,new MyComparator());//降序
        for (int i : test) {
            System.out.print(i+",");
        }
    }
}
class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}