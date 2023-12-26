package ex07.example;

interface EventListener{
    void action();
}

class MyApp{

    public void click(EventListener l){
        l.action();
    }
}


// 개발자인 내가 구현


public class InterEx02 {
    public static void main(String[] args) {
        MyApp mu = new MyApp();
        mu.click(    () ->{
            System.out.println("회원가입 로직이 실행됩니다");
        });
    }
}
