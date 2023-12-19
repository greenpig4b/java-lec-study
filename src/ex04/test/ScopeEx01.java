package ex04.test;

public class ScopeEx01 {

    int n1 = 1;

    static int n2 = 2;

    static  void m1(){
        int n1 = 10;
        System.out.println("m1 :" + n1);
    };

    void m2(){
        System.out.println("m2 :" + n1);
    };

    //  main 시작전에 n2변수와 m1 메서드가 로드 되었음
    public static void main(String[] args) {
        // main 메인Q 크기는 라인 수에 비례한다.
        System.out.println("1");
        m1();
        System.out.println("2");
        ScopeEx01 sc = new ScopeEx01();
        System.out.println(sc.n1);
        sc.m2();
    }
}
