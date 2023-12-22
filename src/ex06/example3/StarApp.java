package ex06.example3;

public class StarApp {

    public static void gameStart(Zealot u1 ,Dragoon u2){ //1
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dragoon u1 ,Zealot u2){ //2
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dragoon u1 ,Dragoon u2){ //3
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Zealot u1 ,Zealot u2){ //4
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1 ,Zealot u2){ //5
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Zealot u1 ,River u2){ //6
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1 ,River u2){ //7
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1 ,Dragoon u2){ //8
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1 ,River u2){ //9
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1 ,River u2){ //10
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1 ,DarkTempler u2){ //11
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1 ,Zealot u2){ //12
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1 ,Dragoon u2){ //13
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1 ,DarkTempler u2){ //14
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1 ,DarkTempler u2){ //15
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1 ,DarkTempler u2){ //16
        u1.attack();
        u2.attack();
    }


    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");  // 질럿
        Dragoon d1 = new Dragoon("d1"); // 드라군
        Zealot z2 = new Zealot("z2");


        gameStart(z1,d1);
        System.out.println();
        gameStart(d1,z1);
        System.out.println();
        gameStart(z1,z2);
        System.out.println();
        gameStart(z2,z1);
    }

}
