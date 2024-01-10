package ex15.halfway;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

// 통신받는쪽
public class Sever {
    public static void main(String[] args) {
        try {
            //소켓 연결완료
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept(); // 리스너

            //읽기버퍼(read) 생성
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine(); // 받은정보 읽어내는 변수
            System.out.println("클라이언트로부터 받은 메세지: " + requestMsg);

            //쓰기버퍼(send) 생성

            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true, Charset.forName("UTF-8"));

            if (requestMsg.equals("1")){
                pw.println("영화");
            } else if (requestMsg.equals("2")) {
                pw.println("드라마");
            }else{
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
