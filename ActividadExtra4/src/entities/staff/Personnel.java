package entities.staff;

import entities.data.MaritalStatus;
import entities.data.PersonnelDepartment;

import java.time.LocalDate;

public class Personnel extends StaffMemberInfo {
    private PersonnelDepartment department;

    public Personnel() {
    }

    public Personnel(long personID, String personFirstName, String personMiddleName, String personLastName, MaritalStatus maritalStatus, LocalDate staffHireDate, int staffOfficeNumber, PersonnelDepartment department) {
        super(personID, personFirstName, personMiddleName, personLastName, maritalStatus, staffHireDate, staffOfficeNumber);
        this.department = department;
    }
}
