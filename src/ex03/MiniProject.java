package ex03;

import java.util.Random;
import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int com = (int)(Math.random() * 100);
        int count = 0;

        System.out.println("0 ~ 100 사이 값을 적어주세요");
        while (true){

            int user = sc.nextInt();

            if(com == user){
                System.out.println("정답입니다");
                break;
            }else if(com > user){
                System.out.println("좀 더 큰 값을 적어주세요");
                count++;
            }else{
                System.out.println("좀 더 작은 값을 적어주세요");
                count++;
            }

        }
        System.out.println("게임은 총 "+ count + "회 진행하셨습니다.");
    }
}
