package sh.test;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2,3,4,1,8,6};
        for (int i = 0; i < array.length-1; i++) {
            for(int j = 0;j < array.length-1-i;j++) {
                if (array[j]>array[j+1]) {
                  int temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
//                swap(array[j],array[j+1]);
                    List list = new ArrayList();
                }
            }
        }

        printArray(array);
    }

    public static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
