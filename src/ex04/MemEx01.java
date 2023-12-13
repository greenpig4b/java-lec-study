package ex04;

/**
 * 1.jvm 을 실행할때 static = 정적 할당 을 먼저 찾는다
 *
 */
class Person1{
    static int age = 20;
    static char gender = '여';
    //커스텀 자료형
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
