package Test;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. 사용자와 컴퓨터가 가위바위보를 한다
 * 2. 컴퓨터와 사용자 값을 비교한다
 * 3. 이기면 게임끝 지면 다시 값을 받아서 승패를 비교한다
 */

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random com = new Random();
        System.out.print("가위바위보 중 하나를 입렵해주세요");
        int user = sc.nextInt();

        System.out.println(com);
    }
}
