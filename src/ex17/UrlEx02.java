package ex17;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlEx02 {
    public static void main(String[] args) throws IOException {
        URL site = new URL("https://www.naver.com");
        URLConnection url = site.openConnection();

        BufferedReader bufferedReader = new BufferedReader( // 버퍼 생성
                new InputStreamReader(url.getInputStream()) // 타겟 = 보조 스트림
        );

        String inLine;

        while ((inLine = bufferedReader.readLine()) != null){
            System.out.println(inLine);
        }

    }
}
