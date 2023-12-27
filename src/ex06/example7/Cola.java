package ex06.example7;

public class Cola {
    private String name;
    private int price;

    public Cola(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + "가 만들어졌습니다");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
