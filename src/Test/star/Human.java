package Test.star;

public class Human extends Terran {
    String name;


    public Human(String name){
        this.name = name;
    }

    public void attack2(Terran a , Terran b){
        System.out.println(a + "번째 휴먼이 " + b + "을 공격하고 있습니다");
    }

    public void attack(){
        System.out.println( name + "번째 휴먼이 공격을 하고 있습니다" );
    }
    public void attack(Terran name , Terran name2 ){
        System.out.println( name + "에 의해서" +  name2 + "공격을 받고 있습니다" );
    }
}
