package services.student;

import entities.student.Student;

import java.util.ArrayList;

public interface StudentInterface{
    public void registerNewStudent(ArrayList<Student> students);
    public void updateStudentInfo(ArrayList<Student> students);
    public void deleteStudent (ArrayList<Student> students);
    public void fetchStudentList(ArrayList<Student> students);
}
