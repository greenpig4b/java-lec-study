package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;

        System.out.println("정수를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.printf("%d!은 %d입니다.\n",n ,fact);
        }
    }
}
