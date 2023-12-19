package ex03.test;

public class SelectedTest01 {
    public static void main(String[] args) {
        int[] arr = {5,8,6,2,7,9};
        final int N = arr.length;
        int rep;
        int min;

        for (int j = 0; j < N-1; j++) {

            rep = j;
            min = rep;

            for (int i = rep+1; i < N; i++) {

                if(arr[min] > arr[i]){
                    min = i;
                }
            }

            if(min != rep){
                int temp = arr[rep];
                arr[rep] = arr[min];
                arr[min] = temp;
            }

        }
        for (int v : arr){
            System.out.print(v + " ");
        }
    }
}
