package services.student;

import entities.BasicInfo;
import entities.student.Student;
import services.BasicInfoInterface;
import services.BasicInfoServices;

import java.util.ArrayList;

public interface StudentInterface{
    public void registerNewStudent(ArrayList<Student> students);
    public void fetchStudentInfo(Student student);
    public Student updateStudentInfo(Student oldStudent);
    public Student deleteStudent (Student studentToDelete);
}
