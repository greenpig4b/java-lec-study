package ex06.example4;



public class StarApp {

    public static void gameStart(Protoss u1 , Protoss u2){ //1
        u1.attack();
        u2.attack();
    }



    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");  // 질럿

        Protoss d1 = new Dragoon("d1"); // 드라군

        Protoss r1 = new River("r1"); // 리버

        Protoss dt1 = new DarkTempler("dt1"); // 다크템플러

        gameStart(z1,r1);
        System.out.println();
        gameStart(dt1,d1);
    }

}
