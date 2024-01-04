package ex16;



public class Example01 {

    public static void sub1(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("스레드가 시작합니다: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void sub2(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("스레드가 시작합니다: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            sub1();
        });t1.start();

        Thread t2 = new Thread(() -> {
            sub2();
        });t2.start();

    }



}
