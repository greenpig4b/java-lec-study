package ex03;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;
        int rep;
        int min;
        //변경해야할 위치 --> replace -> rep
        //변경해야할 위치 --> min -> min


        for (int j = 0; j < N-1; j++) {
            rep = j;
            min = rep;

            for (int i = rep+1; i < N; i++) {

                if (arr[min] > arr[i]){
                    min = i;
                }
            }

            if(rep != min){
                int temp = arr[rep];
                arr[rep] = arr[min];
                arr[min] = temp;
            }
        }
        for(int v : arr){
            System.out.print(" " + v);
        }
    }
}












//
//        i = i + 1; // 2
//        if (arr[min] > arr[i]){
//            min = i; // 2
//        }
//        i = i + 1; // 3
//        if (arr[min] > arr[i]){
//            min = i;
//        }
//        i = i + 1; // 4
//        if (arr[min] > arr[i]){
//            min = i;
//        }








//        //2.회전
//        rep = 1;
//        min = rep;
//
//        for (int i = rep+1; i < N; i++) {
//
//            if (arr[min] > arr[i]){
//                min = i;
//            }
//        }
//
//        if(rep != min){
//            int temp = arr[rep];
//            arr[rep] = arr[min];
//            arr[min] = temp;
//        }
//
//        //3.회전
//        rep = 2;
//        min = rep;
//
//        for (int i = rep+1; i < N; i++) {
//
//            if (arr[min] > arr[i]){
//                min = i;
//            }
//        }
//
//        if(rep != min){
//            int temp = arr[rep];
//            arr[rep] = arr[min];
//            arr[min] = temp;
//        }





