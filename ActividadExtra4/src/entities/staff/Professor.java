package entities.staff;

import entities.data.ClassCourse;
import entities.data.MaritalStatus;

import java.time.LocalDate;

public class Professor extends StaffMemberInfo {
    private ClassCourse classTaught;

    public Professor() {
    }

    public Professor(long personID, String personFirstName, String personMiddleName, String personLastName, MaritalStatus maritalStatus, LocalDate staffHireDate, int staffOfficeNumber, ClassCourse classTaught) {
        super(personID, personFirstName, personMiddleName, personLastName, maritalStatus, staffHireDate, staffOfficeNumber);
        this.classTaught = classTaught;
    }

    public ClassCourse getClassTaught() {
        return classTaught;
    }

    public void setClassTaught(ClassCourse classTaught) {
        this.classTaught = classTaught;
    }
}
