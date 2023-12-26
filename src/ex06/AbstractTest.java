package ex06;

abstract class Shape001{
    int x, y;
    public void translate(int x , int y){
        this.x = x;
        this.y = y;
    }

    public  abstract void draw();
}

class Rectangle01 extends Shape001{
    int width,height;

    public void draw(){
        System.out.println("사각형 그리기");
    }
}

class Circle01 extends Shape001{
    int radius;

    public void draw(){
        System.out.println("원 그리기 메소드");
    }
}


public class AbstractTest {
    public static void main(String[] args) {
        Shape001 s1 = new Rectangle01();
        Shape001 s2 = new Circle01();

        s2.draw();
    }
}

