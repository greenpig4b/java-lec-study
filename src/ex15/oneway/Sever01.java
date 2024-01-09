package ex15.oneway;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever01 {
    public static void main(String[] args) {
        try {
            // 연결소켓 생성
            ServerSocket serverSocket = new ServerSocket(10000);
            // 새로운 소켓 생성
            Socket socket = serverSocket.accept();

            //버퍼생성
            BufferedReader br = new BufferedReader(
                   new InputStreamReader(socket.getInputStream())
            );

            //while 문
            while(true){
                String leadCheck = br.readLine();

                if(leadCheck == null){
                    break;
                }
                System.out.println(leadCheck);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
