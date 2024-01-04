package coffee;

public class CoffeApp {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Customer customer = new Customer(barista); // 고객은 바리스타에게 의존하는 관계

        customer.order("아메리카노");
    }
}
