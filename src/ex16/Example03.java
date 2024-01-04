package ex16;






public class Example03 {

    public static void sub1(){
        try {
            for (int s = 0; s <= 5; s++) {
                System.out.println("카운트다운: "+ s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Thread T1 = new Thread(() -> {
            sub1();
        }); T1.start();
    }
}
