package ex04;

public class MethodEx01 {
    //static 은 클래스 안에 있으면 앞에 클래스 이름 생략이 가능하다
    static void m1(){
        System.out.println("m1");
    } //기본적인 메서드 반환x

    static String m2(){
        System.out.println("m1");
        return "m2";  //매서드 종류
    } //반환 가능

    //함수를 호출하는 순간 {} 내부 메모리에 열린다

    public static void main(String[] args) {
        m1();

        String result = m2(); //실행이 끝나면 return 값이 들어온다
        System.out.println("result : " + result);

    }
}
