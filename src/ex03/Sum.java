package ex03;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 10; i++){
           // sum = sum + i ;
              sum += i;
        }
        System.out.println("1부터 10까지의 정수의 합 = " +sum);
    }
}
