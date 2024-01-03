package ex16;



//컨택트 스위칭 조건 : 잠깐멈추는 타이밍이 필요하다
//main thread
public class ThreadEx01 {
    public static void sub1() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("start1 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void sub2() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("start2 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // main thread
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            sub1();
        });
        t1.start();

        // 실을 만드는 것
        Thread t2 = new Thread(() -> {
            sub2();
        });
        t2.start(); // 실을 시작하는것
    } // main 스레드 종료
}
