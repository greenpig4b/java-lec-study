package ex13;

import java.util.Vector;

class Monster2{
    String name;
    Integer hp;

    public Monster2(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString(){
        return "{"+name+","+hp+"}";

    }
}
class Count{
    public Count() {
        for (int i = 0; i < 5; i++) {

        }
    }
}
public class VectorTest0001 {
    public static void main(String[] args) {
        Vector<Monster2> list = new Vector<>();

        list.add(new Monster2("몬스터1",250));
        list.add(new Monster2("몬스터2",20));
        list.add(new Monster2("몬스터3",200));
        System.out.println(list.size());
        System.out.println(list);

        list.remove(2); //삭제 명령어
        System.out.println(list.size());
        System.out.println(list);

        //list.set(1,new Monster2("몬스터 바뀜",50));// 인덱스 1원소 대체하는 명령어
       // System.out.println(list.get(1));
        list.add(new Monster2("몬스터3",200));
        for(Monster2 v : list){
            System.out.println(v + "");
            System.out.println("결과가 나왔다");
            new Thread(() -> {

            }).start();
        }

    }
}
