package services;

import entities.staff.Personnel;
import entities.staff.Professor;
import entities.student.Student;
import services.staff.PersonnelService;
import services.staff.ProfessorService;
import services.student.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class CollegeService {
    Scanner read = new Scanner(System.in);
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Professor> professors = new ArrayList<>();
    //Ya sé que Personnel es plural. Pero ya le metí mucho como para cambiarlo. Mala mía.
    public static ArrayList<Personnel> personnels = new ArrayList<>();
    BasicInfoService basicInfoServices = new BasicInfoService();
    StudentService studentService = new StudentService(basicInfoServices, students);
    ProfessorService professorService = new ProfessorService();
    PersonnelService personnelService = new PersonnelService();
    public void loadPeople(){
        System.out.println("Start load...");
        studentService.loadStudents(students);
        professorService.loadProfessors(professors);
        personnelService.loadPersonnels(personnels);
        System.out.println("Finished loading...");
    }
    public void studentMenu(){

        while(true) {
            System.out.println("1 => Register new Student");
            System.out.println("2 => See all students");
            System.out.println("3 => Edit student's info");
            System.out.println("4 => Delete a student");
            System.out.println("0 => Exit.");

            int option = Integer.parseInt(read.nextLine());
            switch (option) {
                case 1 -> studentService.registerNewStudent();
                case 2 -> studentService.fetchStudentList();
                case 3 -> studentService.updateStudentInfo();
                case 4 -> studentService.deleteStudent();
                case 0 -> {
                    return;
                }
            }
        }
    }

}
