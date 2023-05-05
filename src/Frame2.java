import javax.swing.*;
import java.awt.*;

public class Frame2 extends JFrame {
    private JLabel label;

    public Frame2(String data) {
        label = new JLabel("Data from First Frame: " + data);

        setLayout(new FlowLayout());
        add(label);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
