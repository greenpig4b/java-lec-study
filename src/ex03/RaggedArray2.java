package ex03;

import java.util.Arrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        int[][] seats = {
                {0,0,0,0,1,0,0,0,1,},
                {0,0,0,2,0,0,0,0,0,},
                {0,0,3,0,1,0,0,0,1,}
        };
        for (int[] row : seats){
            System.out.println(Arrays.toString(seats));
        }
    }
}
