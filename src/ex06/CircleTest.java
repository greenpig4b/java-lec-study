package ex06;

class Shape{
    int x, y;

    public Shape(){
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape{ // 상속받으면 부모먼저 실행된다
    int radius;  // 반지름

    public Circle(int radius) {  // 생성자
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
        super.x = 0;
        super.y = 0;
    }

    double getArea(){
        return 3.14 * radius * radius;
    }

}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
    }
}
