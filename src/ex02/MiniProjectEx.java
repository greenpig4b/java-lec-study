package ex02;

import java.util.Scanner;

public class MiniProjectEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choose;
        double c, f, cTemp, fTemp;

        System.out.print("숫자를 적어주세요");
        choose = sc.nextInt();

        if( choose > 1){
            System.out.print("화씨온도를 적으세요");

            f =  sc.nextInt();
            cTemp = (double) 5/9 * (f - 32);

            System.out.println("섭씨온도는" + cTemp);
        }else{
            System.out.print("섭씨온도를 적으세요");

            c = sc.nextInt();
            fTemp = (c * (double) 5/9) + 32;

            System.out.println("화씨온도는" + fTemp);
        }
    }
}
