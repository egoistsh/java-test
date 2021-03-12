package sh.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(foo(list));
        System.out.println(list);
    }

    public static List foo(List list) {
        list.set(1,4);
        return list;
    }
}
