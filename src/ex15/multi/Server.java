package ex15.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public static void main(String[] args) {

        // 통신만 받는 스레드

        try {
            // 소켓 생성 //
            ServerSocket serverSocketsocket = new ServerSocket(15000);
            Socket socket = serverSocketsocket.accept();

            // 읽기버퍼 생성//
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            // 전달받은 메세지 출력 //
            Thread t1 = new Thread(() -> {
                while (true){
                    try {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트부터 받은 메세지 :" + requestMsg);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            t1.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 키보드 값 받아서 통신보내는 스레드
        try {

            // 쓰기 퍼버 생성 //
            Socket writeSocket = new Socket("localHost",16000);
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(writeSocket.getOutputStream())
            );
            //키보드
            Scanner sc = new Scanner(System.in);

            // 키보드 값 출력 //
            Thread t2 = new Thread(() -> {
                while (true){
                    try {
                        String keybordMsg = sc.nextLine();
                        bw.write(keybordMsg + "\n");
                        bw.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
