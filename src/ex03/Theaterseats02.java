package ex03;

public class Theaterseats02 {
    public static void main(String[] args) {
        int [][] seats = {
                {0,0,0,0,0,1,1,1,0,0},
                {0,1,0,0,0,1,1,1,0,0},
                {0,0,0,1,0,0,1,0,0,0}
        };

        int max = 0;
        int num = 0;

        for (int i = 0; i < seats.length; i++) {
            int count = 0;
            num++;

            for (int j = 0; j < seats[i].length; j++) {
                count = count + seats[i][j] ;
            }
            System.out.println( num + "번째 행의 관객의 수는" + count);
            max = max + count;
        }
        System.out.println("총관객의 수 는 "+ max);
    }
}
