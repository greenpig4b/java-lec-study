package ex07.example;
//추상 클래스는 나중에 추상적으로 만들어서 쓴다(나중에 )
//인터페이스는 구체적인것을 만들기전에 강제로 시킬때 쓰인다(처음에 )

interface Remocon {

   void on(); // public abstract 예외처리
   void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모콘 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모콘 off");
    }
}

class CommonRemocon{
    private Remocon r;

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }
    public void off(){
        r.off();
    }

}

/**
 * 작성자 : 홍길동
 * 날짜: 2023.12.26
 * 구현체 : SamsungRemocon , LgRemocon
 */

public class InterEx01 {

    public static void main(String[] args) {
        CommonRemocon r1 = new CommonRemocon(new SamsungRemocon()); // 생성자가 객체를 전달
        r1.on();
    }
}