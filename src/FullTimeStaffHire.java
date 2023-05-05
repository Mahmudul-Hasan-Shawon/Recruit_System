
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire {
    private Double salary;
    private int weeklyFractionalHours;

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
            int weeklyFractionalHours) {
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
