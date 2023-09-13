package services.student;

import entities.student.Student;

import java.util.ArrayList;

public interface StudentInterface{
    public void registerNewStudent(ArrayList<Student> students);
    public void fetchStudentInfo(Student student);
    public void updateStudentInfo(Student oldStudent);
    public Student deleteStudent (Student studentToDelete);
}
