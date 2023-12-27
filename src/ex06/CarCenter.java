package ex06;

public class CarCenter {
    public static void main(String[] args) {

        Car c1 = new Car("common",5000);
        Car s1 = new Sonata("sonata",8000,"옵션2");
        Bike b1 = new Bike("bike",1000);



        System.out.println();
        SetCenter set1 = new SetCenter(s1,b1);
        System.out.println();
        System.out.println(set1.getToalPrice());
    }
}
