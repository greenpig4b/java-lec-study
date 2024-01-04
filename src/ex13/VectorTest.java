package ex13;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector();

        vc.add("Hello World");
        vc.add(20);
        vc.add(new String("10"));


        System.out.println("백터의 사이즈는" + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("백터 엘리먼트는 " + i +": " + vc.get(i));
        }
    }
}
