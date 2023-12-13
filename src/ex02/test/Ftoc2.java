package ex02.test;

import java.util.Scanner;

public class Ftoc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 화씨 온도 받기
        System.out.print("화씨온도는 : ");
        double temp = sc.nextDouble();

        //2. 섭씨 온도 변환
        double result = 5.0 / 9.0 * (temp - 32);
        System.out.println(result);

        System.out.print("섭씨온도를 적으세요");

    }
}
