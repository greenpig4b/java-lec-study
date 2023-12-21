package ex05;


import java.sql.Array;

public class ArrayArgumentTest {
    public static double Array(double[] list){
        double min = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min){
                min = list[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        double[] s = {-1, 5, 10, 50, -9};
        double[] n = {0, 10, -20, 20, 5};

        double min;
        min = Array(s);
        System.out.println("첫 번째 배열의 최소값은 " + min);

        min = Array(n);
        System.out.println("두 번째 배열의 최소값은 " + min);

    }
}
