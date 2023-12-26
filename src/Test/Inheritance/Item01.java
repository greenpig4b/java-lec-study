package Test.Inheritance;

abstract class 부모{

    public abstract void Shouting(); // abstract 쓸때 매서드 {} 지우고 ; 를 써준다

}

class 아들 extends 부모{
    public void Shouting(){ // Shouting -- 재정의
        System.out.println("밥주세요");
    }
}

class 딸 extends 부모{
    public void Shouting(){
        System.out.println("집에 언제와");
    }
}
class 삼촌 extends 부모{
    public void Shouting(){
        System.out.println("나 아직 집에 못가");
    }
}
class 오빠 extends 부모{
    public void Shouting(){
        System.out.println("용돈 올려주세요");
    }
}


public class Item01 {

    public static void main(String[] args) {
        부모 u1 = new 딸();  // 다형성
        부모 v1 = new 아들();

        u1.Shouting();  // 부모값 을 무시하고 인바이딩한 값을 배출한다.
        System.out.println();
        v1.Shouting();

    }
}
