package coffee;

public class Customer { // 의존하는 쪽에 생성자를 넘겨준다

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }  //컴퍼지션 문법 // 의존적일때 쓰인다.

    public void order(String menuName){ // 행위 = 책임
        Coffee coffee = barista.makeCoffee();
        System.out.println(coffee.name + "를 받았습니다.");
    }

}
