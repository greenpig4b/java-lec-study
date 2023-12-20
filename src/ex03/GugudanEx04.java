package ex03;

public class GugudanEx04 {
    //1~9단까지 출력되는 프로그램을 만드세요
    // 스캐너를 이용하여 입락받은 단만 출력하시오.
    class GugudanUtil{
        static void gugudan(int x){

            for (int i = 1; i <= 9; i++){
                System.out.println(x + "*" + i + "=" + (x * i));
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        // GugudanUtil 클래스에 gugudan 매서드를 호출하세요
        // parameter 는 int 한개가 필요합니다
        // 구구단을 출력해주는 매서드

        GugudanUtil.gugudan(10);
    }
}
