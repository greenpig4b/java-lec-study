package ex17.oneWay;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 요청하는 쪽
public class Client {
    public static void main(String[] args) {

        //localHost = 127.0.0.1(루프백)
        try {
            Socket socket = new Socket("127.0.0.1",10000); // 127.0.0.1 루프백 아이피 : 자기자신 아이피

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(),"UTF-8")
            );

            bw.write(msg+"\n");
            //bw.write(msg);
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
