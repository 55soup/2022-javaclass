package src.GUI;

import javafx.scene.shape.StrokeLineCap;

import javax.swing.*;
import java.awt.*;

public class LionGraphics extends JFrame {

    private MyPanel panel = new MyPanel();
    public LionGraphics() {

        setTitle("fillXXX 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(800, 800);
        setVisible(true);
    }
    class MyPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Color background = new Color(55, 84, 126);
            Color LION = new Color(247, 172, 29);
            Graphics2D g2 = (Graphics2D) g;
            Stroke strokeRound = new BasicStroke(14f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
            g2.setStroke(strokeRound); // 끝에 둥글게
            //배경화면
            g.setColor(background);
            g.fillRect(0, 0, 800, 800);
            //귀 왼쪽
            g2.setColor(Color.black);
            g2.drawOval(100, 100, 130, 160);
            g.setColor(LION);
            g.fillOval(100,100, 130, 160);
            //귀 오른쪽
            g2.setColor(Color.black);
            g2.drawOval(300, 100, 130, 160);
            g.setColor(LION);
            g.fillOval(300,100, 130, 160);
            ///////////얼굴
            //외곽선
            g2.setColor(Color.black);
            g2.drawOval(50, 120, 430, 400);
            //채우기
            g.setColor(LION);
            g.fillOval(50, 120, 430, 400);
            //눈썹 왼쪽
//            g2.setStroke(new BasicStroke(10));
            g2.setColor(Color.black);
            g2.drawLine(150,260, 220, 260);
            //눈썹 오른쪽
            g2.setColor(Color.black);
            g2.drawLine(330,260, 400, 260);
            //눈 왼쪽
            g.setColor(Color.black);
            g.fillOval(170, 285, 27,27);
            //눈 오른쪽
            g.setColor(Color.black);
            g.fillOval(347, 285, 27,27);
            //입
            g.setColor(Color.white);
            g.fillOval(228, 345, 60,50);
            g.setColor(Color.white);
            g.fillOval(262, 345, 60,50);

            //코
            g.setColor(Color.black);
            g.fillOval(255, 330, 35,35);


        }
    }

    public static void main (String[]args){
        new LionGraphics();

    }
}
