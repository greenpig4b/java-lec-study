package ex17;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class UrlEx03 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time-c.nist.gov",13);  //소켓생성
            InputStream inputStream = s.getInputStream(); // 보조스트림 생성
            Scanner sn = new Scanner(inputStream);  // 보조스트림값 담는 스캐너 생성

            while(sn.hasNext()){   //hasNext boolean 값이있으면 트루반환
                String line = sn.nextLine();   //
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
