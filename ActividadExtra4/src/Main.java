import entities.staff.Personnel;
import entities.staff.Professor;
import entities.student.Student;
import services.CollegeService;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Professor> professors = new ArrayList<>();
    public static ArrayList<Personnel> personnels = new ArrayList<>();
    public static CollegeService collegeService = new CollegeService();

    public static void main(String[] args) {
        collegeService.loadPeople(students, professors, personnels);

        System.out.println(students.get(0).getMaritalStatus());
        System.out.println(students.get(0).getEnlistedCourses());
    }
}