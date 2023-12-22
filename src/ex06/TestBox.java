package ex06;

class Base{
    int x;

    public Base(int x){
        System.out.println("Base() 생성자");
    }
}

class Derived extends Base{
    public Derived(int x){
        super(x);
        System.out.println(x);
    }
}


public class TestBox {
    public static void main(String[] args) {
        Derived r = new Derived(10);
    }
}
