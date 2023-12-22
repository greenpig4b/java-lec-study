package ex06.example2;

//재정의 연습
class Animal {

    void speak(){
        System.out.println("멍멍");
    } // 오버라이드 : 자식이 재정의 했으면 부모값 무시
    void run(){
        System.out.println("달린다");
    }
}

class Cat extends Animal{
    // @Override
    //---

    void speak() { // 재정의
        System.out.println("야옹"); // 동적바인딩 : 무시하고 나서 자식값을 호출한다
    }

    //----
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 = new  Cat(); // [Cat , Animal] : 다형성
        c1.speak();
        c1.run();
    }
}
