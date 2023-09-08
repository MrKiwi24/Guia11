package entities.staff;

import entities.BasicInfo;
import entities.data.MaritalStatus;

import java.time.LocalDate;

public class StaffMember extends BasicInfo {

    private LocalDate staffHireDate;
    private int staffOfficeNumber;

    public StaffMember(){
    }

    public StaffMember(long personID, String personFirstName, String personMiddleName, String personLastName, MaritalStatus maritalStatus, LocalDate staffHireDate, int staffOfficeNumber) {
        super(personID, personFirstName, personMiddleName, personLastName, maritalStatus);
        this.staffHireDate = staffHireDate;
        this.staffOfficeNumber = staffOfficeNumber;
    }

    public LocalDate getStaffHireDate() {
        return staffHireDate;
    }

    public void setStaffHireDate(LocalDate staffHireDate) {
        this.staffHireDate = staffHireDate;
    }

    public int getStaffOfficeNumber() {
        return staffOfficeNumber;
    }

    public void setStaffOfficeNumber(int staffOfficeNumber) {
        this.staffOfficeNumber = staffOfficeNumber;
    }
}
