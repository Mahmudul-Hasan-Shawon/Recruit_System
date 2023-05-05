import javax.swing.JOptionPane;

public class PartTimeStaffHire extends StaffHire {
    private int workingHoursPerDay;
    private int wagesPerHour;
    private String shifts;

    public PartTimeStaffHire(int vacancyNumber, String designationType, String jobType, String staffName,
            String joiningDate, String qualification, String appointedBy, boolean joined,
            int workingHoursPerDay, int wagesPerHour, String shifts) {
        super(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHoursPerDay = workingHoursPerDay;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
    }

    public void addToStaffHireList() {
        staffList.add(this);
        System.out.println("Added the following object to staffList:");
        System.out.println("Current staffList:");
        for (StaffHire staffHire : staffList) {
            System.out.println(staffHire.toString());
        }
    }

    public String toString() {
        return String.format(
                "PartTimeStaffHire [\nvacancyNumber=%d, \ndesignation=%s, \njobType=%s, \nstaffName=%s, \njoiningDate=%s, \nqualification=%s, \nappointedBy=%s, \njoined=%b, \nworkingHoursPerDay=%d, \nwagesPerHour=%.2f, \nshifts=%s\n]",
                this.getVacancyNumber(), this.getDesignationType(), this.getJobType(), this.getStaffName(),
                this.getJoiningDate(), this.getQualification(), this.getAppointedBy(), this.isJoined(),
                this.getWorkingHoursPerDay(), this.getWagesPerHour(), this.getShifts());
    }

    public int getWorkingHoursPerDay() {
        return workingHoursPerDay;
    }

    public void setWorkingHoursPerDay(int workingHoursPerDay) {
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public float getWagesPerHour() {
        return wagesPerHour;
    }

    public void setWagesPerHour(double d) {
        this.wagesPerHour = d;
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        if (isJoined()) {
            this.shifts = shifts;
            System.out.println("Shifts updated successfully.");
        } else {
            System.out.println("The staff hasn't joined yet. Can't set shifts.");
        }
    }

    // Add any additional methods specific to part-time staff hires here
}
