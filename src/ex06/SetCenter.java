package ex06;

public class SetCenter{
    private Car car;
    private Bike bike;



    public int getToalPrice(){
        return car.getPrice() + bike.getPrice();
    }

    public SetCenter(Car car, Bike bike) {
        this.car = car;
        this.bike = bike;
        System.out.println(car.getName() + "가 나왔습니다"); // private를 써서 name 을쓰는게 아니라 getter을 써야한다
        System.out.println(bike.getName() + "가 나왔습니다");
        System.out.println("탈것 세트가 나왔습니다.");
    }



    public Car getCar() {
        return car;
    }

    public Bike getBike() {
        return bike;
    }
}
