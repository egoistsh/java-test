package zwq;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Son extends Test{
    @Override
    public void run() {
        System.out.println("sun");
    }

    public void run2(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Son();
        test.run();;
        test1.run();
        Son son = new Son();
        int[] arr = {1,2,3,4};

        List list = new ArrayList();
        son.run2(list);

    }
}
