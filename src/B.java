import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

class Myframe extends JFrame{

    Myframe(){
        JFrame frame = new JFrame(null, null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        // frame.setLayout(new GridLayout(4,2,10,100));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 3, 5, 10));
        panel.setBounds(25, 25, 700, 400);

        JLabel label_1 = new JLabel("Vacancy:");
        JLabel label_2 = new JLabel("Designation:");
        JLabel label_3 = new JLabel("Job Type:");
        JLabel label_4 = new JLabel("Job Date:");
        JLabel label_5 = new JLabel("Staff Name:");
        JLabel label_6 = new JLabel("Appointed By:");
        JLabel label_7 = new JLabel("Qualification:");
        JLabel label_8 = new JLabel("Salary");

        JLabel label_18 = new JLabel("");
        JLabel label_19 = new JLabel("");
        JLabel label_20 = new JLabel("");

        JLabel label_21 = new JLabel("");
        JLabel label_22 = new JLabel("");
        JLabel label_23 = new JLabel("");
        JLabel label_24 = new JLabel("");

        JLabel label_25 = new JLabel("");
        JLabel label_26 = new JLabel("");
        JLabel label_27 = new JLabel("");
        JLabel label_28 = new JLabel("");

        JLabel label_29 = new JLabel("");
        JLabel label_30 = new JLabel("");

        JLabel label_13 = new JLabel("Weekly Fractional Hours:");
        JLabel label_14 = new JLabel("Working Hours:");
        JLabel label_15 = new JLabel("Wages Per Hour:");
        JLabel label_16 = new JLabel("Shifts:");
        JLabel label_17 = new JLabel("Display Number:");

        JTextField textField_1 = new JTextField();
        JTextField textField_2 = new JTextField();
        JTextField textField_3 = new JTextField();
        JTextField textField_4 = new JTextField();
        JTextField textField_5 = new JTextField();
        JTextField textField_6 = new JTextField();
        JTextField textField_7 = new JTextField();
        JTextField textField_8 = new JTextField();

        JTextField textField_13 = new JTextField();
        JTextField textField_14 = new JTextField();
        JTextField textField_15 = new JTextField();
        JTextField textField_16 = new JTextField();
        JTextField textField_17 = new JTextField();

        JButton btn_1 = new JButton("Add Fulltime Staff");
        btn_1.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = textField_1.getText();
                Frame2 secondFrame = new Frame2(data);
                secondFrame.setVisible(true);
            }
        });




        JButton btn_2 = new JButton("Add Partime Staff");
        JButton btn_3 = new JButton("Add Salary");
        JButton btn_4 = new JButton("Add Working Shifts");
        JButton btn_5 = new JButton("Terminate");

        JButton btn_6 = new JButton("Display Number");

        panel.add(label_1);
        panel.add(textField_1);

        panel.add(label_2);
        panel.add(textField_2);

        panel.add(label_3);
        panel.add(textField_3);

        panel.add(label_4);
        panel.add(textField_4);

        panel.add(label_5);
        panel.add(textField_5);

        panel.add(label_6);
        panel.add(textField_6);

        panel.add(label_7);
        panel.add(textField_7);

        panel.add(label_8);
        panel.add(textField_8);

        panel.add(label_18);
        panel.add(label_19);
        panel.add(label_20);

        JCheckBox checkBox_1 = new JCheckBox("Joined");
        panel.add(checkBox_1);
        // 21-24
        panel.add(label_21);
        panel.add(label_22);
        panel.add(label_23);
        panel.add(label_24);

        panel.add(label_13);
        panel.add(textField_13);

        panel.add(label_14);
        panel.add(textField_14);

        panel.add(label_15);
        panel.add(textField_15);

        panel.add(label_16);
        panel.add(textField_16);
        // 25-28
        panel.add(label_25);
        panel.add(label_26);
        panel.add(label_27);
        panel.add(label_28);

        panel.add(label_17);
        panel.add(textField_17);

        panel.add(btn_1);
        frame.add(panel);

        panel.add(btn_2);
        frame.add(panel);

        panel.add(btn_3);
        frame.add(panel);

        panel.add(btn_4);
        frame.add(panel);

        // 29
        panel.add(label_29);

        panel.add(btn_5);
        frame.add(panel);

        JCheckBox checkBox_2 = new JCheckBox("Terminate");
        panel.add(checkBox_2);
        // 30
        panel.add(label_30);

        panel.add(label_17);
        panel.add(textField_17);

        panel.add(btn_6);
        frame.add(panel);

        frame.setVisible(true);


    }
}


class B{
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        
    }
}

