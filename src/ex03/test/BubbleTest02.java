package ex03.test;

public class BubbleTest02 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};

        final int N = arr.length;

        //세번째 4바퀴 돌리고 내부적으로 (4,3,2,1)바퀴 돌기
        for (int i = 0; i < N - 1; i++) {
            // System.out.println("1");
            for (int x = 0; x < N -i- 1; x++) {
                System.out.println("돌아");
                //두번째 조건 4바퀴 도는데 1회전때 4바퀴를 돌려라
            }
            System.out.println();
        }
    }
}
