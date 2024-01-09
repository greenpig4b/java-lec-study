package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 크기가 정해져있을떄.
public class StreamEx02 {
    public static void main(String[] args) {

        InputStreamReader ir = new InputStreamReader(System.in); // 키보드로 데이터받는 객체 생성
        char[] ch = new char[4]; // 보조스트림

        try {
            ir.read(ch);

            for (char c : ch){
                System.out.println(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
