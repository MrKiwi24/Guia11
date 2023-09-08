package entities.staff;

import entities.data.MaritalStatus;
import entities.data.PersonnelDepartment;
import entities.staff.StaffMember;

import java.time.LocalDate;

public class Personnel extends StaffMember {
    private PersonnelDepartment department;

    public Personnel() {
    }

    public Personnel(long personID, String personFirstName, String personMiddleName, String personLastName, MaritalStatus maritalStatus, LocalDate staffHireDate, int staffOfficeNumber, PersonnelDepartment department) {
        super(personID, personFirstName, personMiddleName, personLastName, maritalStatus, staffHireDate, staffOfficeNumber);
        this.department = department;
    }
}
