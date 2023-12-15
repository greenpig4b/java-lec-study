package ex03;

public class TheaterSeats {
    public static void main(String[] args) {
        //배열은 구조 변경 불가
        int[][] seats = {
                {0,0,0,1,1,0,0,0,0,0},
                {0,0,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,0}
        };
        int total = 0;
        int count = 0;
        int row = 0;

        for (int i = 0; i <seats.length ; i++) {
            count = 0;
            row++;

            for (int j = 0; j < seats[i].length; j++) {
                count = count + seats[i][j];

            }
            System.out.println( row +"행 관객의 수는" + count);
            total = total + count;

        }
        System.out.println("총 관객의 수는 " + total);




        //첫행찾기
//        int[] seat1 = seats[0];
//        count = 0;
//
//        for (int i = 0; i < seats[0].length  ; i++) {
//            count = count + seats[0][i];
//        }
//        System.out.println("첫번째 관객수는 "+ count);
//        sum = sum + count;
//
//        int[] seat2 = seats[1];
//        count = 0;
//
//
//        for (int i = 0; i < seats[1].length  ; i++) {
//            count = count + seats[1][i];
//        }
//        sum = sum + count;
//
//        int[] seat3 = seats[2];
//        count = 0;
//
//        for (int i = 0; i < seats[2].length  ; i++) {
//            count = count + seats[2][i];
//        }
//        System.out.println("세번째 관객수는 "+ count);
//        sum = sum + count;
//
//        System.out.println("전체관객수는 " + sum);
    }
}
