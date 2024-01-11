package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx01 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000); // 연결소켓
            System.out.println("통신을 기다리고 있습니다.");

            Socket clientSocket = serverSocket.accept(); // 새로운소켓
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(),true);
            BufferedReader br= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("연결되었습니다");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
