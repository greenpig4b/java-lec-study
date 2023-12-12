package ex01;

public class VarEx01 {
    //1.자바의 모든 코드는 class와 {}안에 적는다
    //2.파일명은 클래스앞과 동일해야한다

    // 모든 코드는 main 매서드 내부에 적는다
    public static void main(String[] args) {
        int n1 = 1;  // 21억까지 들어간다. 정수 (4byte)
        double d1 = 1.5; // 21억까지 들어간다 실수 (8byte)
        long big1 = 20000000000L; // 경단위 까지 들어간다 (8byte)
        boolean b1 = true; // true, false
        char c1 = '가';

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    }// 자바 프로그램 종료
}
