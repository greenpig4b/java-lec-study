package ex14.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CopyEx01 {

    /**
     *
     * 1.stream
     * 2.가공(map[연산] , filter[boolean]true,false)
     * 3.collect
     */

    public static void main(String[] args) {
        var list2 = Arrays.asList(1);
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        //객체복사
        List<Integer> newList = new ArrayList<>(list);
        newList.add(5);

        System.out.println(list.size());
        System.out.println(newList.size());

    }
}
