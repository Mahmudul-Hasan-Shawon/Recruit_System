import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

/**
 * shan
 */
public class Recruit_system {

    public static void main(String[] args) {
        JFrame frame = new JFrame(null, null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        // frame.setLayout(new GridLayout(4,2,10,100));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 3, 5, 10));
        panel.setBounds(25, 25, 700, 400);

        JLabel vacancyNumLabel = new JLabel("Vacancy:"); // Lb-1
        JLabel designationLabel = new JLabel("Designation:"); // Lb-2
        JLabel jobTypeLabel = new JLabel("Job Type:"); // Lb3
        JLabel joiningDateLabel = new JLabel("Job Date:"); // lb4
        JLabel staffNameLabel = new JLabel("Staff Name:"); // lb5
        JLabel appointedByLabel = new JLabel("Appointed By:"); // lb6
        JLabel qualificationLabel = new JLabel("Qualification:"); // lb7
        JLabel salaryLabel = new JLabel("Salary"); // lb8

        JLabel label_18 = new JLabel(""); // lb18
        JLabel label_19 = new JLabel(""); // lb19
        JLabel label_20 = new JLabel(""); // lb20

        JLabel label_21 = new JLabel(""); // lb21
        JLabel label_22 = new JLabel(""); // lb22
        JLabel label_23 = new JLabel(""); // lb23
        JLabel label_24 = new JLabel(""); // lb24
        // After Shifts Button
        JLabel label_25 = new JLabel(""); // lb25
        JLabel label_26 = new JLabel(""); // lb26
        JLabel label_27 = new JLabel(""); // lb27
        JLabel label_28 = new JLabel(""); // lb28

        JLabel label_29 = new JLabel(""); // lb29
        JLabel label_30 = new JLabel(""); // lb30

        JLabel weeklyFractionalHoursLabel = new JLabel("Weekly Fractional Hours:"); // lb13
        JLabel workingHoursLabel = new JLabel("Working Hours:"); // lb14
        JLabel wagesPerHourLabel = new JLabel("Wages Per Hour:"); // lb15
        JLabel shiftsLabel = new JLabel("Shifts:"); // lb16
        JLabel displayNumLabel = new JLabel("Display Number:"); // lb17

        JTextField vacancyNumField = new JTextField(); // txt_field_1
        JTextField designationField = new JTextField(); // txt_field_2
        JTextField jobTypeField = new JTextField(); // txt_field_3
        JTextField joiningDateField = new JTextField(); // txt_field_4
        JTextField staffNameField = new JTextField(); // txt_field_5
        JTextField appointedByField = new JTextField(); // txt_field_6
        JTextField qualificationField = new JTextField(); // txt_field_7
        JTextField salaryField = new JTextField(); // txt_field_8
        JTextField weeklyFractionalHoursField = new JTextField(); // txt_field_13
        JTextField workingHoursField = new JTextField(); // txt_field_14
        JTextField wagesPerHourField = new JTextField(); // txt_field_15
        JTextField shiftsField = new JTextField(); // txt_field_16
        JTextField displayNumField = new JTextField(); // txt_field_17

        JCheckBox joinedField = new JCheckBox("Joined");

        JCheckBox TerminateField = new JCheckBox("Terminate");

        JButton Add_Fulltime_Staff_btn = new JButton("Add Fulltime Staff"); // btn_1
        JButton addParttimeStaffButton = new JButton("Add Partime Staff"); // btn_2

        panel.add(Add_Fulltime_Staff_btn);
        panel.add(addParttimeStaffButton);
        frame.add(panel);
        frame.setVisible(true);

        JButton addSalaryButton = new JButton("Add Salary"); // btn_3
        JButton addWorkingShiftsButton = new JButton("Add Working Shifts"); // btn_4
        JButton terminateButton = new JButton("Terminate"); // btn_5
        JButton displayNumButton = new JButton("Display Number"); // btn_6
        JButton clearButton = new JButton("Clear"); // btn_6

        Add_Fulltime_Staff_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String VacancyNumber = vacancyNumField.getText();
                String designation = designationField.getText();
                String jobType = jobTypeField.getText();
                String staffName = staffNameField.getText();
                String joiningDate = joiningDateField.getText();
                String qualification = qualificationField.getText();
                String appointedBy = appointedByField.getText();
                Boolean joined = joinedField.isSelected();
                String salary = salaryField.getText();
                String weeklyFractionalHours = weeklyFractionalHoursField.getText();

                if (VacancyNumber.isEmpty() || designation.isEmpty() || jobType.isEmpty() ||
                        staffName.isEmpty() || joiningDate.isEmpty() || qualification.isEmpty() || appointedBy.isEmpty()
                        || salary.isEmpty() || weeklyFractionalHours.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required");
                } else {
                    try {
                        FullTimeStaffHire staff = new FullTimeStaffHire(
                                Integer.parseInt(VacancyNumber),
                                designation,
                                jobType,
                                staffName,
                                joiningDate,
                                qualification,
                                appointedBy,
                                joined,
                                Double.parseDouble(salary),
                                Integer.parseInt(weeklyFractionalHours));
                        staff.addToStaffHireList();

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,
                                "an error occurred");
                    }
                    // System.out.println(weeklyFractionalHours);
                }
            }
        });
        addParttimeStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vacancyNumber = vacancyNumField.getText();
                String designation = designationField.getText();
                String jobType = jobTypeField.getText();
                String staffName = staffNameField.getText();
                String joiningDate = joiningDateField.getText();
                String qualification = qualificationField.getText();
                String appointedBy = appointedByField.getText();
                Boolean joined = joinedField.isSelected();
                String workingHours = workingHoursField.getText();
                String wagesPerHour = wagesPerHourField.getText();
                String shifts = shiftsField.getText();

                if (vacancyNumber.isEmpty() || designation.isEmpty() || jobType.isEmpty() ||
                        staffName.isEmpty() || joiningDate.isEmpty() || qualification.isEmpty() || appointedBy.isEmpty()
                        || workingHours.isEmpty() || wagesPerHour.isEmpty() || shifts.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required");
                } else {
                    try {
                        PartTimeStaffHire staff = new PartTimeStaffHire(
                                Integer.parseInt(vacancyNumber),
                                designation,
                                jobType,
                                staffName,
                                joiningDate,
                                qualification,
                                appointedBy,
                                joined,
                                Integer.parseInt(workingHours),
                                Integer.parseInt(wagesPerHour),
                                shifts);
                        staff.addToStaffHireList();

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,
                                "an error occurred");
                    }
                }
            }
        });
        addSalaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vacancyNumber = vacancyNumField.getText();
                String staffName = staffNameField.getText();

                if (vacancyNumber.isEmpty() || staffName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vacancy number and staff name are required.");
                } else {
                    // search for the FullTimeStaffHire object with the given vacancy number and
                    // staff name
                    for (StaffHire staffHire : StaffHire.staffList) {
                        if (staffHire instanceof FullTimeStaffHire) {
                            FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffHire;
                            if (fullTimeStaffHire.getVacancyNumber() == Integer.parseInt(vacancyNumber)
                                    && fullTimeStaffHire.getStaffName().equals(staffName)) {
                                // set the salary for the FullTimeStaffHire object
                                String salaryStr = JOptionPane.showInputDialog(null, "Enter salary:");
                                try {
                                    double salary = Double.parseDouble(salaryStr);
                                    fullTimeStaffHire.setSalary(salary);
                                    JOptionPane.showMessageDialog(null, "Salary set successfully.");
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid salary input.");
                                }
                                return;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "No matching FullTimeStaffHire object found.");
                }
            }
        });
        addWorkingShiftsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vacancyNumber = vacancyNumField.getText();
                String staffName = staffNameField.getText();
                String shifts = shiftsField.getText();

                // Check if all required fields are filled
                if (vacancyNumber.equals("") || staffName.equals("") || shifts.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Please fill all required fields.");
                    return;
                }

                // Find the PartTimeStaffHire object with the given vacancy number and set its
                // shifts
                for (StaffHire staffHire : StaffHire.staffList) {
                    if (staffHire instanceof PartTimeStaffHire
                            && staffHire.getVacancyNumber() == Integer.parseInt(vacancyNumber)) {
                        PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                        if (partTimeStaffHire.isJoined()) {
                            partTimeStaffHire.setShifts(shifts);
                            JOptionPane.showMessageDialog(frame, "Working shifts updated for " + staffName + ".");
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    staffName + " has not joined yet. Cannot update shifts.");
                        }
                        return;
                    }
                }

                // If no PartTimeStaffHire object with the given vacancy number is found
                JOptionPane.showMessageDialog(frame, "No part-time staff hire found with the given vacancy number.");
            }
        });
        terminateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vacancyNumber = vacancyNumField.getText();

                // Check if vacancy number is filled
                if (vacancyNumber.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a vacancy number.");
                    return;
                }

                // Find the PartTimeStaffHire object with the given vacancy number and terminate
                // it
                for (StaffHire staffHire : StaffHire.staffList) {
                    if (staffHire instanceof PartTimeStaffHire
                            && staffHire.getVacancyNumber() == Integer.parseInt(vacancyNumber)) {
                        PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                        if (partTimeStaffHire.isJoined()) {
                            staffHire.terminate();
                            JOptionPane.showMessageDialog(frame,
                                    "Part-time staff with vacancy number " + vacancyNumber + " terminated.");
                        } else {
                            JOptionPane.showMessageDialog(frame, "Staff member has not joined yet. Cannot terminate.");
                        }
                        return;
                    }
                }

                // If no PartTimeStaffHire object with the given vacancy number is found
                JOptionPane.showMessageDialog(frame, "No part-time staff hire found with the given vacancy number.");
            }
        });
        displayNumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vacancyNumber = displayNumField.getText();

                // Check if displayNumField is empty
                if (vacancyNumber.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a vacancy number.");
                    return;
                }

                // Search for staff member with matching vacancy number
                for (StaffHire staffHire : StaffHire.staffList) {
                    if (staffHire.getVacancyNumber() == Integer.parseInt(vacancyNumber)) {
                        JOptionPane.showMessageDialog(frame, staffHire.toString());
                        return;
                    }
                }

                // If no staff member with matching vacancy number is found
                JOptionPane.showMessageDialog(frame, "No staff member found with the given vacancy number.");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear values from text fields
                vacancyNumField.setText("");
                jobTypeField.setText("");
                designationField.setText("");
                workingHoursField.setText("");
                wagesPerHourField.setText("");
                shiftsField.setText("");
                salaryField.setText("");
                staffNameField.setText("");
                joiningDateField.setText("");
                qualificationField.setText("");
                appointedByField.setText("");
                displayNumField.setText("");
                displayNumLabel.setText("");

                // Unselect checkboxes
                joinedField.setSelected(false);
                TerminateField.setSelected(false);
            }
        });

        // Label Name & Text Field
        panel.add(vacancyNumLabel);
        panel.add(vacancyNumField);

        panel.add(designationLabel);
        panel.add(designationField);

        panel.add(jobTypeLabel);
        panel.add(jobTypeField);

        panel.add(joiningDateLabel);
        panel.add(joiningDateField);

        panel.add(staffNameLabel);
        panel.add(staffNameField);

        panel.add(appointedByLabel);
        panel.add(appointedByField);

        panel.add(qualificationLabel);
        panel.add(qualificationField);

        panel.add(salaryLabel);
        panel.add(salaryField);

        panel.add(label_18);
        panel.add(label_19);
        panel.add(label_20);

        panel.add(joinedField);
        // 21-24
        panel.add(label_21);
        panel.add(label_22);
        panel.add(label_23);
        panel.add(label_24);

        panel.add(weeklyFractionalHoursLabel);
        panel.add(weeklyFractionalHoursField);

        panel.add(workingHoursLabel);
        panel.add(workingHoursField);

        panel.add(wagesPerHourLabel);
        panel.add(wagesPerHourField);

        panel.add(shiftsLabel);
        panel.add(shiftsField);
        // 25-28
        panel.add(label_25);
        panel.add(label_26);
        panel.add(label_27);
        panel.add(label_28);

        panel.add(displayNumLabel);
        panel.add(displayNumField);

        panel.add(Add_Fulltime_Staff_btn);
        frame.add(panel);

        panel.add(addParttimeStaffButton);
        frame.add(panel);

        panel.add(addSalaryButton);
        frame.add(panel);

        panel.add(addWorkingShiftsButton);
        frame.add(panel);

        // 29
        panel.add(label_29);

        panel.add(terminateButton);
        frame.add(panel);

        panel.add(TerminateField);

        // 30
        panel.add(label_30);

        panel.add(displayNumLabel);
        panel.add(displayNumField);

        panel.add(displayNumButton);
        panel.add(clearButton);
        frame.add(panel);

        frame.setVisible(true);

    }

}