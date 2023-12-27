package ex06.example7;

public class BugerApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거",1000); // [Burger]
        Burger b2 = new ShrimpBurger("새우버거",2000,"새우"); // [Burger ,Shrimp]
        Cola c1 = new Cola("콜라",1000);
        System.out.println();


        BurgerSet set2 = new BurgerSet(
                new ShrimpBurger("새우버거",2000,"새우"),
                new Cola("콜라",1000)
        );
        System.out.println();


        BurgerSet set1 = new BurgerSet(
                new Burger("기본버거",1000),
                new Cola("콜라",1000)
        );
        System.out.println();


        System.out.println("총 가격은: " + set1.getTotalPrice());
        System.out.println("총 가격은: " + set2.getTotalPrice());
        // System.out.println(set1.getBurger().getPrice());
    }
}
