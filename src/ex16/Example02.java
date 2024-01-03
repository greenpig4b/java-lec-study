package ex16;




class spead{
     public void speadCheck(){
        System.out.println("바로확인 가능합니다");
    }
}



public class Example02 {

    static public void downloading(){
        try {
            for (int i = 0; i < 1; i++) {
                Thread.sleep(5000);
                System.out.println("다운로드를 완료했습니다");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   static public void spead(){
       System.out.println("바로확인이 가능합니다");
   }


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            downloading();
        });
        t1.start();
        spead();
        spead s1 = new spead();
        s1.speadCheck();
    }
}
