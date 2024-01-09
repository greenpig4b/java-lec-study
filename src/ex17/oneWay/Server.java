package ex17.oneWay;

//요청을 받는쪽

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            //연결용 소켓
            ServerSocket serverSocket = new ServerSocket(10000); // port : 어디로 통신할지 정한다(2Byte)
            //새로운 소켓
            Socket socket = serverSocket.accept(); //accept : 리스너 소켓은 최소2개를 사용  port번호 랜덤으로 생성
            System.out.println("연결확인");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            while(true){
                String msg = br.readLine();
                if(msg == null){
                    break;
                }

                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
