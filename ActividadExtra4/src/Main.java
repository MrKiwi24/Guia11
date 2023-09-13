import entities.staff.Personnel;
import entities.staff.Professor;
import entities.student.Student;
import services.CollegeService;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Professor> professors = new ArrayList<>();
    //Ya sé que Personnel es plural. Pero ya le metí mucho como para cambiarlo. Mala mía.
    public static ArrayList<Personnel> personnels = new ArrayList<>();
    public static CollegeService collegeService = new CollegeService();

    public static void main(String[] args) {
        //Load the lists with hardcoded data for testing and app usage.
        collegeService.loadPeople(students, professors, personnels);


        collegeService.studentMenu(students);
    }
}