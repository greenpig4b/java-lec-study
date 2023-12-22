package ex06;



//private 지정한 값은 상속을 받아도 자식클래스에서 접근할 수 없다.
class Person{
    private String regnumer;
    private double weight;
    protected int age;

    void print(){
        age = 80;
    }


    public double getweight(){ // 뱉어내는 값
        return weight;
    }

    public void setWeight(double weight){  // 받아오는 값
        this.weight = weight;
    }

}

class Student extends Person{
    int id;  // 학번

}


public class StudentTest {
    public static void main(String[] args) {
        Person obk = new Person();

        obk.setWeight(80);
        System.out.println(obk.getweight());


        Student obj = new Student();

      // obj.weight = 80; 오류가난다
      obj.age = 60;
      obj.setWeight(80);



    }
}
