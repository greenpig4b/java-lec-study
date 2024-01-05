package ex14.example1;

import java.util.Arrays;
import java.util.List;

//filter
public class CopyEx03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        // filter
        List<Integer> newList = list.stream().filter(i -> i < 3 ).toList();

        // forEach
        newList.stream().forEach(i -> System.out.println(i));
    }
}
