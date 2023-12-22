package ex06;


//상속예제 extends
class Animal {
    int age;

    void eat(){
        System.out.println("먹고있음");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("짖고있음");
    }
}


public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        d.eat();
    }
}
