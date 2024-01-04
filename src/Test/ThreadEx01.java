package Test;



public class ThreadEx01 {

    public void sun1(){
        try {
            for (int s = 0; s < 10; s++) {
                System.out.println("카운트가 실행되었습니다: " + s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        ThreadEx01 s = new ThreadEx01();
       new Thread(() -> {
           s.sun1();
       }).start();
    }
}
