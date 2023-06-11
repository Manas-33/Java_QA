package ls;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberAddition {
    private JFrame frame;
    private JTextField f1;
    private JTextField s1;
    private JTextField r1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

                    NumberAddition window = new NumberAddition();
                    window.frame.setVisible(true);
    }

    /**
     * Create the application.
     */
    public NumberAddition() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("Number Addition");
        label1.setForeground(Color.BLUE);
        label1.setBounds(20, 10, 100, 30);
        frame.getContentPane().add(label1);

        // for number 1
        JLabel first = new JLabel("First Number: ");
        first.setBounds(20, 40, 120, 20);
        frame.getContentPane().add(first);
        f1 = new JTextField();
        f1.setBounds(140, 40, 140, 20);
        frame.getContentPane().add(f1);

        // for number 2
        JLabel second = new JLabel("Second Number:");
        second.setBounds(20, 65, 120, 20);
        frame.getContentPane().add(second);
        s1 = new JTextField();
        s1.setBounds(140, 65, 140, 20);
        frame.getContentPane().add(s1);

        // for result
        JLabel result = new JLabel("Result:");
        result.setBounds(10, 90, 120, 20);
        frame.getContentPane().add(result);
        r1 = new JTextField();
        r1.setEditable(false);
        r1.setBounds(140, 90, 140, 20);
        frame.getContentPane().add(r1);

        // add button
        JButton add = new JButton("ADD");
        add.setBounds(90, 120, 80, 20);
        frame.getContentPane().add(add);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(f1.getText());
                    int num2 = Integer.parseInt(s1.getText());
                    int sum = num1 + num2;
                    r1.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        // clear button
        JButton clear = new JButton("CLEAR");
        clear.setBounds(200, 120, 80, 20);
        frame.getContentPane().add(clear);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setText("");
                s1.setText("");
                r1.setText("");
            }
        });

        // exit button
        JButton exit = new JButton("Exit");
        exit.setBounds(250, 200, 80, 20);
        frame.add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
