package ex03;

import java.util.Scanner;


public class GugudanEx01 {
    public static void main(String[] args) {
        // 2 ~ 9 단 까지 출력되는 프로그램을 만드십시오.

       for(int x = 2; x <= 9; x++){
           for(int i = 1; i <= 9; i++){
                System.out.println(x + "x" + i + "=" + (x * i));
            }
         }



      // 단마다 옆으로 나뉘도록 프로그램을 만들어라

       for(int i = 1; i <= 9; i++ ){
           for(int x = 2; x <= 9; x++){
               System.out.print(x + "x" + i + "=" + (x * i) + "\t" );
            }
           System.out.println();
        }


        //2. 스캐너를 이용하여 입력받은 단만 출력하시오.
        Scanner sc = new Scanner(System.in);
        System.out.print("알고싶은 구구단 천번째 숫자를 적어주세요 : ");
        int user = sc.nextInt();

        if(1 < user && user < 10){
           for(int c = 1; c <= 9; c++){
                System.out.println(user + "x" + c  + "=" + (user*c) );
           }
        }

    }
}
