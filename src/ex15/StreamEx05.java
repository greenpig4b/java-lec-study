package ex15;


import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;

// 상대 경로 : 실행되는 위치(프로잭트폴더)를 기반으로 경로 정하는 것
// 절대 경로 : 루트에서 부터 경로를 찾는것
// 윈도우 : C:\workspace\hello.txt
// 맥,리눅스 : /workspace/hello.txt
public class StreamEx05 {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt")); 절대경로

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

            // OutputStreamWriter out = new OutputStreamWriter(new BufferedWriter(System.out));
            //                                    (                     타켓                     )
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt")); //상대경로
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            BufferedReader bwReader = new BufferedReader(new FileReader("input.txt")); //상대경로

            String line = br.readLine();
            System.out.println(line);
            System.out.println("찾음");

            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();

            Object line2 = bwReader.readLine(); //파일안에 있는 내용읽음
            System.out.println(line2);
            System.out.println("찾음");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}