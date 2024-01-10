package ex15.halfway;


import java.io.*;
import java.net.Socket;

//통신하는쪽
public class Client {
    public static void main(String[] args) {
        //소켓생성
        try {
            Socket socket =new Socket("localHost",20000);
        //쓰기버퍼 생성
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

            pw.println("2");

        //읽기버퍼 생성
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String responseMsg = br.readLine();

            System.out.println("서버로부터 받은 메세지: "+ responseMsg);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
