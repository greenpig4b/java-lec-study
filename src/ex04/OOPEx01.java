package ex04;
class Person3{
    int weight = 100;
}
public class OOPEx01 {

    public static void main(String[] args) {
        //존재 가능성이 있으면 object  ex) new
    Person3 p3 = new Person3();
        System.out.println("p3의 몸무게 : " + p3.weight);

        p3.weight = 60; //객체 지향 x
        System.out.println("p3의 몸무게 : " + p3.weight);
    }
}
