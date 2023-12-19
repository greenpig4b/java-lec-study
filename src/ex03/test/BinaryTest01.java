package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        final int N = arr.length;
        final int target = 1;
        int start = 0;
        int end = N -1;
        int mid;
        int round = 1;

        mid = start +((end - start)/2);
        while(true){
            if(target == mid){
                System.out.println( round + "회전" + target + "타겟값은"  + mid + "번지에 있습니다.");
                break;
            }
            if(arr[mid] < target){
                start = mid + 1 ;

            }
            if(arr[mid] > target){
                end = mid -1;
            }

            System.out.println(round + "회전 start : " + start);
            System.out.println(round + "회전 end : " + end);

            round++;

        }
    }
}
