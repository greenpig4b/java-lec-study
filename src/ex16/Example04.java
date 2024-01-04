package ex16;

import javax.swing.*;

public class Example04 extends JFrame {
    private boolean state = true; // 멈추는버튼 생성
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

public Example04(){
    setTitle("숫자 카운터 프로그램");
    setSize(300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //레이아웃 매니저 설정
    setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

    // 숫자를 표시할 레이블 생성
    countLabel = new JLabel("현재 숫자: " + count);
    countLabel.setAlignmentX(CENTER_ALIGNMENT);
    add(countLabel);

    count2Label = new JLabel("현재숫자" + count2);
    count2Label.setAlignmentX(CENTER_ALIGNMENT);
    add(count2Label);
}



}
