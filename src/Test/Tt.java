package Test;

public class Tt {
    public static void main(String[] args) {
        // 5,8,2,4,3


        //1 회전 (4바퀴)
        // 1. 5,8 비교 (변화없음)
        // 2. 8,2 비교 (5,2,8,4,3)
        // 3. 8,4 비교 (5,2,4,8,3)
        // 4. 8,3 비교 (5,2,4,3,8)

        //2 회전 (3바퀴)
        // 1. 5,2 비교(2,5,4,3,8)
        // 2. 5,4 비교(2,4,5,3,8)
        // 3. 5,3 비교(2,4,3,5,8)

        //3 회전 (2바퀴)
        // 1. 2,4 비교(변화없음)
        // 2. 4,3 비교(2,3,4,5,8)

        //4 회전 (1바퀴)
        // 1. 2,3 비교(변화없음)

    }
}
