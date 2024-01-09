package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("안녕\n"); // \n 줄바꿈을 위함이 아니라 없으면 통신이 되지않는다, 마지막이나 다 붙여줘야한다
            bw.write("반갑습니다\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
