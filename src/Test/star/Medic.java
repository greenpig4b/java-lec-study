package Test.star;

public class Medic extends Terran {
    String name;

    public Medic(String name){
        this.name = name;
    }

    public void attack2(Terran a , Terran b){
        System.out.println(a + "번째 매딕이 " + b + "을 공격하고 있습니다");
    }

    public void attack(){
        System.out.println( name + "번째 매딕이 치료를하고 있습니다" );
    }
    public void attack(Terran name , Terran name2 ){
        System.out.println( name + "에 의해서" +  name2 + "공격을 받고 있습니다" );
    }

}
