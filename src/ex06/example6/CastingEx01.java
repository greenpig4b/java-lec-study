package ex06.example6;
// 다운캐스팅

class Protoss{

}

class Zealot extends Protoss{
    public void attack(){
        System.out.println("질럿이 공격을 합니다");
    }
}
class Dragoon extends Protoss{
    public void attack(){
        System.out.println("드라군이 공격을 합니다");
    }
}

//런타임 오류  : 코드상으로 문제없는 오류


public class CastingEx01 {

    public static void start(Protoss p){

        if (p instanceof Zealot){
            Zealot u = (Zealot) p;
            u.attack();
        }
        if (p instanceof Dragoon){
            Dragoon u = (Dragoon) p;
            u.attack();
        }

        Dragoon u = (Dragoon) p ;  // 부모를 자식에게 대입 할 수 없다.
        u.attack();
    }


    public static void main(String[] args) {
        start(new Dragoon());
        start(new Zealot());
    }
}
