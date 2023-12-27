package ex06.example7;

public class BurgerSet {  // has  버거 + 콜라
    private Burger burger;
    private Cola cola;

    public BurgerSet(Burger burger, Cola cola) { //  has 컴퍼지션
        this.burger = burger;
        this.cola = cola;
        System.out.println("버거세트가 만들어졌습니다");
    }

    public int getTotalPrice(){
        return burger.getPrice() + cola.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Cola getCola() {
        return cola;
    }
}
