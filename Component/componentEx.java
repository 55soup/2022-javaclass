package src.Component;
import java.awt.*;

import javax.swing.*;

public class componentEx extends JFrame {
    public componentEx() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

//        JCheckBox apple = new JCheckBox("사과");
//        JCheckBox pear = new JCheckBox("배", true);
//        JCheckBox cherry = new JCheckBox("체리", cherryIcon);
        ButtonGroup g = new ButtonGroup();
        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배");
        JRadioButton cherry = new JRadioButton("체리");
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        g.add(apple);
        g.add(pear);
        g.add(cherry);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250,150);
        setVisible(true);
    }
    public static void main(String [] args) {
        new componentEx();
    }
}

