package services.student;

import entities.student.Student;

import java.util.ArrayList;

public interface StudentInterface{
    public void registerNewStudent();
    public void updateStudentInfo();
    public void deleteStudent ();
    public void fetchStudentList();
}
