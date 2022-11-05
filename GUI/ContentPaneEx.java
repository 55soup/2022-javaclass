package src.GUI;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
    ContentPaneEx(){
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 프레임 종료와 동시에 프로그램 종료

        Container contentPane = getContentPane();
        //컨텐트팬 알아내기 --> 내가 사용할 도화지 선택하기
        contentPane.setBackground(Color.GREEN);
        //컨텐트팬 배경색 설정 --> 도화지 색상 설정
        contentPane.setLayout(new FlowLayout());
        //컨텐트 팬에 배치관리자 설정 -->

        contentPane.add(new JButton("OK"));
        //컨텐츠 팬에 버튼 삽입 --> 도화지에 버튼 부착
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        //프레임에 대한 옵션
        setSize(300,150);
        setVisible(true);
    }//ContentPane

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}


