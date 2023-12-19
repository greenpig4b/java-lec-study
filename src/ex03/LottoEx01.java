package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();

        int num;
        int j;


        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                num =  r.nextInt(10) + 1;
                arr[i] = num;
            }else{
                while(true){
                    num =  r.nextInt(10) + 1;

                    if(arr[i - 1] != num){

                        arr[i] = num;
                        break;
                    }
                }
            }
        }




        System.out.println(Arrays.toString(arr));
    }
}






//        num =  r.nextInt(45) + 1;
//        arr[2] = num;
//
//        num =  r.nextInt(45) + 1;
//        arr[3] = num;
//
//        num =  r.nextInt(45) + 1;
//        arr[4] = num;
//
//        num =  r.nextInt(45) + 1;
//        arr[5] = num;