package ex13;


import java.util.ArrayList;

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){

          return "("+x+","+y+")";
          //  return "{"+x+","+y+"}";
    }



}

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList<Point> layer= new ArrayList<>();

        layer.add(new Point(10,10));
        layer.add(new Point(10,10));
        layer.add(new Point(10,10));
        layer.add(new Point(10,10));
        layer.add(new Point(10,10));
        layer.add(new Point(10,10));

        System.out.println(layer.size());
        System.out.println(layer);

        }
    }

