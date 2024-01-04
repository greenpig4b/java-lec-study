package ex13;

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector();

        vec.add("Apple");
        vec.add("Mango");
        vec.add("Banana");

        System.out.println(vec.size());


        for (int i = 0; i < vec.size(); i++) {
            System.out.println("백터안에 들어가있는 " + i + "번째값은 : "+ vec.get(i) + "입니다");
        }

        for (String s : vec){
            System.out.print(s + " ");
        }

    }
}
