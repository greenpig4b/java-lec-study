package ex15.oneway;


import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

// 요청하는 쪽
public class Client01 {
    public static void main(String[] args) {

        //수정함
        try {
            Socket socket = new Socket("127.0.0.1",10000);
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );
            bw.write("감사합니다"+ "\n");
            bw.write("알겠습니다"+ "\n");
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
