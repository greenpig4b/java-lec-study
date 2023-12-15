package ex03.test;

public class BubbleTest07 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};

        final int N = arr.length;
        int temp;

        // 3회전
        for (int i = 0; i < N-1; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            for (int j = 0; j < N-2; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for (int k = 0; k < N-3; k++) {
                    if (arr[k] > arr[k+1]){
                        temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
