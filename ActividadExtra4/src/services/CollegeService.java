package services;

import entities.staff.Personnel;
import entities.staff.Professor;
import entities.student.Student;
import services.staff.PersonnelService;
import services.staff.ProfessorService;
import services.student.StudentService;

import java.util.ArrayList;

public class CollegeService {
    StudentService studentService = new StudentService();
    ProfessorService professorService = new ProfessorService();
    PersonnelService personnelService = new PersonnelService();
    public void loadPeople(ArrayList<Student> students,
                           ArrayList<Professor> professors,
                           ArrayList<Personnel> personnels){

        studentService.loadStudents(students);
        professorService.loadProfessors(professors);
        personnelService.loadPersonnels(personnels);
    }


}
