package ex06;

class Shape01{
    protected int x ,y;
    void print(){
        System.out.println("x좌표: " + x + "y좌표: " + y);
    }
}

class Another{
    Shape01 n = new Shape01();
    int plus = n.x + n.y;
}

public class Rectangle extends Shape01{
    int width, height;

    double calcArea(){
        return width * height;
    }
    void draw(){
        System.out.println("("+ x + "," + y +") 위치에" + "가로: " + width + "세로: " + height );
    }
}
