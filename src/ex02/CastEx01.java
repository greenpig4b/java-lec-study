package ex02;

public class CastEx01 {
        public static void main(String[] args) {
        int n1 = 1; // int 4Byte
        double d1 = 1.5;  // double 8Byte

        n1 = 2;

        d1 = n1; // 묵시적 형변환 Upcasting
        System.out.println(d1);

        //꺼지지않은 프로세스 데몬
        n1 = (int)d1; // Downcasting
        System.out.println(n1);
    }
}
