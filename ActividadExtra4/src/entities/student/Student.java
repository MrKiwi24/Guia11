package entities.student;

import entities.Person;
import entities.data.ClassCourse;
import entities.data.MaritalStatus;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<ClassCourse> enlistedCourses;

    public Student(){
    }

    public Student(long personID, String personFirstName, String personMiddleName, String personLastName, MaritalStatus maritalStatus, ArrayList<ClassCourse> enlistedCourses) {
        super(personID, personFirstName, personMiddleName, personLastName, maritalStatus);
        this.enlistedCourses = enlistedCourses;
    }

    public ArrayList<ClassCourse> getEnlistedCourses() {
        return enlistedCourses;
    }

    public void setEnlistedCourses(ArrayList<ClassCourse> enlistedCourses) {
        this.enlistedCourses = enlistedCourses;
    }
}
