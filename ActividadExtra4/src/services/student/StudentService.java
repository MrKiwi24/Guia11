package services.student;

import entities.data.ClassCourse;
import entities.data.MaritalStatus;
import entities.student.Student;

import java.util.ArrayList;

public class StudentService {
    public void loadStudents(ArrayList<Student> students){
        Student st = new Student();
        MaritalStatus ms = MaritalStatus.SINGLE;

        st.setMaritalStatus(ms);
        ClassCourse cs = ClassCourse.PHYSICS;
        ClassCourse cs1 = ClassCourse.BIOLOGY;
        ArrayList<ClassCourse> classes = new ArrayList<>();
        classes.add(cs);
        classes.add(cs1);
        st.setEnlistedCourses(classes);
        students.add(st);
    }
}
