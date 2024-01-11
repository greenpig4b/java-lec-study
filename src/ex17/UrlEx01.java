package ex17;

import java.net.InetAddress;

public class UrlEx01 {
    public static void main(String[] args) {
        String hostName = "www.google.com";

        try {
            InetAddress address = InetAddress.getByName(hostName);
            System.out.println("IP 주소: " + address.getHostAddress());
        } catch (Exception e) {
            System.out.println(hostName + "의 IP 주소를 찾을 수 없습니다");
        }

    }
}
