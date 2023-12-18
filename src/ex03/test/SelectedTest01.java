package ex03.test;

public class SelectedTest01 {

    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        int N = arr.length;
        int rep;
        int min;

        for (int i = 0; i < N -1; i++) {
            rep = i;
            min = rep;

            for (int j = rep+1; j < N; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }

            if (rep != min){
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
