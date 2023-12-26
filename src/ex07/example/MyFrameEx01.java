package ex07.example;

import javax.swing.*;
import java.awt.*;


public class MyFrameEx01 {
    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //jf.setLayout(new BorderLayout());
        jf.setSize(300,500);


        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");

        JLabel lal = new JLabel(num+"");

        jf.add( "North",btn1);
        jf.add("Center",lal);
        jf.add("South",btn2);


        btn1.addActionListener(e -> {
            num++;
            lal.setText(num+"");
        });

        btn2.addActionListener(e -> {
            num--;
            if(num <= 0){
                num = 0;
            }
            lal.setText(num+"");
        });


        jf.setVisible(true);

    }
}
