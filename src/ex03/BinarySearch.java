package ex03;

public class BinarySearch {
    public static void main(String[] args) {
        // 랜덤엑세스가 풀스캔보다 빠른경우는 시간복작도 중 전체 필요한데이터가 15% 미만일 경우이다.
        // 자료를 몇번 찾는지에 따라서 효율이 달라진다 여러개를 찾으면 효율이 안 좋을수도 있다.
        // N = 17
        // 시간복잡도 log2(N) -> log2(17) -> 4.x
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        // 17 / 2*2*2*2*2 -> logn -> log21

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int N = arr.length;
        final int target = 13;
        int start = 0;
        int end = N - 1;
        int mid;

        // --start = mid + 1; 타겟이 크면

        // --end = mid - 1; 타겟이 작으면
        int round = 1;

        while (true) {
            // 1 회전

            mid = start + ((end - start) / 2); // 기대값 6

            if (arr[mid] == target) {
                System.out.println(round + "회전 : " + target + "값은 " + mid + "번지에 있습니다");
                break;
            }

            if (arr[mid] < target) { // 기대값 start 5, end 8
                start = mid + 1;
            }

            if (arr[mid] > target) { //
                end = mid - 1;
            }

            System.out.println(round + "회전 start : " + start);
            System.out.println(round + "회전 end : " + end);

            round++;
        }

        System.out.println("시간복잡도 : " + (Math.log(N) / Math.log(2)));
    }
}
