package ex06;

public class Bike {
    private String name;
    private int price;

    public Bike(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + "가 생성되엇습니다");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
