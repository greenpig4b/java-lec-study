package ex04;

public class MethodEx02 {

    static void m3(int n1){ //
        System.out.println("m3 :" + n1);
    }
    //() -> 파라메터 parameter

    static void m4(int n1 , int n2){
        System.out.println("m4 :" + n1);
        System.out.println("m4 :" + n2);
    }

    public static void main(String[] args) {
        m4(1,2); // 1,2 아규먼트 arguments 인수
    }
}
