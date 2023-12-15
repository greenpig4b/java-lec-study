package ex03;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] ragged = new int[3][];
        ragged[0] = new int[1];
        ragged[1] = new int[2];
        ragged[2] = new int[3];
        int count = 0;

        for(int r = 0; r < ragged.length; r++){
            for (int i = 0; i < ragged[r].length; i++) {
                ragged[r][i] = i;

                count = count + ragged[r][i];
            }
        }
        System.out.println(count);
    }
}
