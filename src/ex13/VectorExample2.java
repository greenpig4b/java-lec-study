package ex13;

import java.util.Vector;

class Monster{
    String name;
    double hp;

    public Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString(){
//        return "{"+ name +", "+ hp +"} ";
        return "{"+ name +","+ hp +"}";
    }

}

public class VectorExample2 {
    public static void main(String[] args) {
        Vector<Monster> list = new Vector<>();

        list.add(new Monster("Mon1",100));

        System.out.println("백터의 크기: " + list.size());
        System.out.print(list);
    }
}
