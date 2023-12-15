package ex03;

import java.util.Scanner;

public class Programing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int user = sc.nextInt();

        if(user == 1){
            System.out.println("Own");
        } else if (user == 2) {
            System.out.println("Two");
        }else{
            System.out.println("OTHER");
        }
    }
}
