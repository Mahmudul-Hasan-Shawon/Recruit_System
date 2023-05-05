
import java.lang.String;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire {
    private Double salary;
    private Integer weeklyFractionalHours;

    /**
     * Constructor for objects of class FullTimeStaffHire
     */
    public FullTimeStaffHire(int vacancyNumber,
            String designationType,
            String jobType,
            String staffName,
            String joiningDate,
            String qualification,
            String appointedBy,
            boolean joined,
            Double salary,
            Integer weeklyFractionalHours) {
        /*
         * 1. salary - a double
         * 2. Designation Type - a whole number
         */
        super(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;

    }

    // Getters
    public double getSalary() {
        return this.salary;
    }

    public int getWeeklyFractionalHours() {
        return this.weeklyFractionalHours;
    }

    public void addToStaffHireList() {
        staffList.add(this);
        System.out.println("Added the following object to staffList:");
        System.out.println(this.toString());
        System.out.println("Current staffList:");
        for (StaffHire staffHire : staffList) {
            System.out.println(staffHire.toString());
        }
    }

    public String toString() {
        return String.format(
                "FullTimeStaffHire [vacancyNumber=%d, designationType=%s, jobType=%s, staffName=%s, joiningDate=%s, qualification=%s, appointedBy=%s, joined=%b, salary=%.2f, weeklyFractionalHours=%d]",
                this.getVacancyNumber(), this.getDesignationType(), this.getJobType(), this.getStaffName(),
                this.getJoiningDate(), this.getQualification(), this.getAppointedBy(), this.isJoined(), this.salary,
                this.weeklyFractionalHours);
    }

    // Setters
    public void setSalary(double salary) {
        if (getJoined() == true) {
            this.salary = salary;
        } else {
            System.out.println("There is no staff appointed to set the salary.");
        }
    }

    public void setWeeklyFractionalHours(int weeklyFractionalHours) {
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    public void display() {
        super.display();
        if (this.salary != null) {
            System.out.println("Salary: " + this.salary);
        }
        System.out.println("WeeklyFractionalHours: " + this.weeklyFractionalHours);
    }
}
