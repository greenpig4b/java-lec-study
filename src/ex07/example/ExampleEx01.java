package ex07.example;

abstract class Mother{
    String name;
    String id;
    public abstract void attack();

}

class brother extends Mother{

    public brother(String name , String id) {
        this.name = name;
        this.id = id;
    }

    public void attack(){
        System.out.println(name + "번째 자식을 불러왔다");
    }

}

class father extends Mother{

    public father(String name,String id) {
        this.name = name;
        this.id = id;
    }

    public void attack(){
        System.out.println(name + "번째 자식을 불러왔다");
    }

}

public class ExampleEx01 {


    public static void gameStart(Mother a , Mother b){
        System.out.println(a.name + "번쨰 " + a.id + "가 " + b.name + "번째 " + b.id + "를 가격하였다.");
    }

    public static void main(String[] args) {
        Mother h1 = new brother("1","brother");
        Mother h2 = new father("2", "father");
        Mother h3 = new father("5","father");

        gameStart(h1,h3);

    }
}
