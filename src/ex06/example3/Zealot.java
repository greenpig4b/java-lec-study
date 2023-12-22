package ex06.example3;

import ex06.example4.Protoss;

public class Zealot extends Protoss {

    String name;

    public Zealot(String name){
        this.name = name;
    }
    public void attack(){
        System.out.println("질럿이 공격을 합니다 " + name);
    }
}
