package ex13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        //크기
        System.out.println(vec.size());

        //인덱스 접근
        System.out.println(vec.get(2));

        //정렬(오름차순)
        Collections.sort(vec);

        for (String s : vec){
            System.out.println(s + "");
        }

        System.out.println();

        //정렬(내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec){
            System.out.println(s + "");
        }

        //정렬의 다른방법
        //Arrays.sort(); 배열을 정렬할떄
        System.out.println();
        //삭제
        String result =  vec.remove(2);
        System.out.println(result);

        System.out.println(vec.size());

        System.out.println();


        //Contains 값 찾기(Mango, mango, MAngo)
        boolean result2 = vec.contains("Apple");
        System.out.println(result2);


    }
}
