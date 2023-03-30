package f1.lecture2;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame();

        JButton b=new JButton("click");
        b.setBounds(0,0,100, 40);

        f.add(b);//adding button in JFrame

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}