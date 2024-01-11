package ex17;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx02 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        Scanner sc = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("연결기다리고있다");
            clientSocket = serverSocket.accept();

            out = new PrintWriter(clientSocket.getOutputStream(),true);

            in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );

            System.out.println("클라이언트가 연결되었습니다.");

            while(true){
                String msg = in.readLine();
                if (msg.equalsIgnoreCase("quit")){
                    System.out.println("클라이언트가 사용종료했음");
                    break;
                }

                System.out.println("클라이언트가 보낸 문자열: " + msg );
                System.out.print("클라이언트가 보낼 문자열을 입력하고 엔터키를 치세요: ");
                String omsg = sc.nextLine();
                out.write(omsg + "\n");
                out.flush();
            }
            out.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
