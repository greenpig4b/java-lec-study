package ex16;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheadEx03 extends JFrame {
    private boolean state = true; // 제거버튼 생성
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;


    public TheadEx03() {
        setTitle("숫자 카운터 프로그램");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("현재 숫자: " + count);
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);

        count2Label = new JLabel("현재 숫자: " + count2);
        count2Label.setAlignmentX(CENTER_ALIGNMENT);
        add(count2Label);

        // 멈춤 버튼 생성
        JButton increaseButton = new JButton("멈춤");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);

        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state = false; // 상태값으로 제어한다
            }
        });

        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(500);
                    count++;
                    countLabel.setText("숫자1: " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();
        //while 안에 있는 스레드 = 데몬 스레드

        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000);
                    count2++;
                    count2Label.setText("숫자2: " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();

        setVisible(true);

    }

    public static void main(String[] args) {
        new TheadEx03();
    }
}