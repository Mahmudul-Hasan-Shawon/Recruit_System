import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame {
    private JTextField textField;
    private JButton button;

    public Frame1() {
        textField = new JTextField(20);
        button = new JButton("Open Second Frame");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = textField.getText();
                Frame2 secondFrame = new Frame2(data);
                secondFrame.setVisible(true);
            }
        });

        setLayout(new FlowLayout());
        add(textField);
        add(button);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Frame1 firstFrame = new Frame1();
        firstFrame.setVisible(true);
    }
}
