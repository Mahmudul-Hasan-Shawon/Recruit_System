import java.lang.String;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire {
    private int vacancyNumber;
    private String designationType;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public static ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();

    /**
     * Constructor for objects of class StaffHire
     */
    public StaffHire(int vacancyNumber,
            String designationType,
            String jobType,
            String staffName,
            String joiningDate,
            String qualification,
            String appointedBy,
            boolean joined) {

        this.vacancyNumber = vacancyNumber;
        this.designationType = designationType;
        this.jobType = jobType;
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
        System.out.println(this.vacancyNumber);
    }

    // Getters
    public int getVacancyNumber() {
        return this.vacancyNumber;
    }

    public String getDesignationType() {
        return this.designationType;
    }

    public Boolean isJoined() {
        return this.joined;
    }

    public void terminate() {
        if (this.isJoined()) {
            this.setJoined(false);
            this.setStaffName("");
            this.setJoiningDate("");
            this.setQualification("");
            this.setAppointedBy("");
            JOptionPane.showMessageDialog(null, "Staff terminated successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Staff has not joined yet.");
        }
    }

    public String getJobType() {
        return this.jobType;
    }

    public String getStaffName() {
        return this.staffName;
    }

    public String getJoiningDate() {
        return this.joiningDate;
    }

    public static ArrayList<StaffHire> getStaffList() {
        return staffList;
    }

    public String getQualification() {
        return this.qualification;
    }

    public String getAppointedBy() {
        return this.appointedBy;
    }

    public boolean getJoined() {
        return this.joined;
    }

    // Setters

    public void setVacancyNumber(int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;
    }

    public void setDesignationType(String designationType) {
        this.designationType = designationType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }

    public void setJoined(boolean joined) {
        this.joined = joined;
    }

    public void display() {
        System.out.println("You are viewing staff member: " + this.staffName);
        System.out.println("---------------------------------------------------");
        System.out.println("Vacancy Number: " + this.vacancyNumber);
        System.out.println("Designation: " + this.designationType);
        System.out.println("Job Type: " + this.jobType);
        System.out.println("Staff Name: " + this.staffName);
        System.out.println("Join Date: " + this.joiningDate);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Appointed By: " + this.appointedBy);
        System.out.println("Joined: " + this.joined);
    }

}
