package ex06.example4;

public class DarkTempler extends Protoss {
    String name;

    public DarkTempler(String name){
        this.name = name;
    }

    public void attack(){
        System.out.println("다크템플러가 공격을 합니다" + name);
    }
}
