package ex07.example;

abstract class Mother{
    String name;
    public abstract void attack();
    public abstract void attack(Mother a ,Mother b);
}

class brother extends Mother{

    public brother(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(name + "번째 자식을 불러왔다");
    }

    public void attack(Mother a ,Mother b){
        System.out.println(a + "번쨰 brother가" + b + "번째 를 공격하였다");
    };

}

class father extends Mother{

    public father(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(name + "번째 자식을 불러왔다");
    }

    public void attack(Mother a ,Mother b){
        System.out.println(name + "번째 father 가" + name+ "를 공격하였다");
    };

}

public class ExampleEx01 {
    public static void main(String[] args) {
        Mother h1 = new brother("1");
        Mother h2 = new father("2");

        h1.attack();
        h1.attack(h1,h2);

        System.out.println(h1);
    }
}
