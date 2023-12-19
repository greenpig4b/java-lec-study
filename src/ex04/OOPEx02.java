package ex04;
class Person4{
    // 상태 = 변수
    private int weight = 100;

    // 행위 = 매서드
    public  void exercise(){
        weight = weight -10;
    }

    public  int getWeight(){
        return weight;
    }

}
//public  다른 클래스에서 접근 가능
//private 다른 클래스에서 접급하지 못하게 막는다
public class OOPEx02 {

    public static void main(String[] args) {
        //존재 가능성이 있으면 object  ex) new
    Person4 p4 = new Person4();

        for (int i = 0; i < 10; i++) {
            p4.exercise();
        }
        System.out.println("p3의 몸무게 : " + p4.getWeight());
    }
}
