package ex01;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1/5;
        System.out.println(f);
        // f는 실수 값을 가지기 때문에 정수인 1/5는 들어가질 못한다

        f = (double)1/5;
        System.out.println(f);
        // 1/5앞에 double 붙어 실수로 계산하기때문에 값이 들어간다

        i = (int)1.7 + (int)1.8;
        System.out.println(i);
        //int 는 정수이기 때문에 실수를 정수자리까지만 변환해 1+1 2가된다

    }
}
