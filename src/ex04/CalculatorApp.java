package ex04;

public class CalculatorApp {
    //매서드 안에는 매서드를 만들 수 없다.
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int result01 = cal.add(50,80);
        System.out.println("add : " +result01);

        int result02 = cal.minus(50,80);
        System.out.println("minus : " + result02);

        int result03 = cal.divide(50,80);
        System.out.println("divide : " + result03);

        int result04 = cal.multi(50,80);
        System.out.println("multi : " + result04);








    }
}
