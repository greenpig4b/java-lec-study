package ex08.example2;

//런타임 인셉션 실행시 오류발생 RuntimeException
//컴파일 인셉션 실행전 오류발생 Exception 강제적

class Cal2{
    //  RuntimeException = 엄마가 알려주지 않을 떄
    public void divide(int num)throws Exception {
        System.out.println(10 / num);
    }

}

public class TryEx01 {
    public static void main(String[] args) {

        Cal2 c2 = new Cal2();
        try {
            c2.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }
}
