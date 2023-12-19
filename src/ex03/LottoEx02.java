package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[6];
        int num;
        boolean isSame;

        // 1. 6바퀴를 돌면서 로또 번호를 추첨할 예정
        // 2. 첫번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 입력
        // 3. 두번째 바퀴부터는 공을 꺼내서 이전에 추첨한 모든 번호를 모아서 비교(isSame)
        // 4. isSame == true 면  (공집어넣지않고 3번부터 다시시작)
        // 5. isSame == false 면 (공집어넣기 3번부터 다시시작)

        for (int i = 0; i < arr.length ; i++) {
            if(i == 0){  //예외처리
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;
            }

            while (true){
                isSame = false;
                num = r.nextInt(45) + 1; // i == 1  -> 0이랑 비교

                /**
                 * 이전 번호들과 비교하는 코드
                 * i == 1일때 (0 이랑 비교)
                 * i == 2일때 (0 이랑 1 비교)
                 * i == 3일때 (0 이랑 1 이랑 2비교)
                 */

                for (int j = i-1; j >= 0 ; j--) {  // -- 다시봐야함
                    if (arr[j] == num){
                        isSame = true;
                        break;
                    }
                }

                //동일한 값이 없을때 값 넣기
                if (!isSame){
                    arr[i] =num;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
