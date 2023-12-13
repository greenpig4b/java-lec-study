package ex04;

class Person2 {    //커스텀 함수
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년지남");
        System.out.println("2년지남");
        System.out.println("3년지남");

        Person2 p = new Person2(); // heap을 쓸때 new 씀 동적할당 type 은 커스텀한 함수를 넣어준다

        System.out.println(p.age);
        System.out.println(p.gender);

        System.out.println("메인종료");
    }
}
