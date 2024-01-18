package com.metacoding.myhttp2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyApp2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String download = "";

            while (true) {
                String line = br.readLine();

                if (line == null) break;

                download = download + line;
            }

           // System.out.println(download);

            ObjectMapper om = new ObjectMapper();
        Todo todo = om.readValue(download, Todo.class);

        System.out.println("==========================");
           System.out.println("나오: "+ todo.getTitle());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}