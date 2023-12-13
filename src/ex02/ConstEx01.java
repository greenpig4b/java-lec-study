package ex02;

public class ConstEx01 {
    public static void main(String[] args) {
        int num = 1; // 변수
        final int sum = 10; // 상수(변경불가 X)
        //final은 최초의 값이 할당되면 변경이 불가능하다.

        num = 2;
        // sum = 20;
    }
}
