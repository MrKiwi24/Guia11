package services;

import entities.staff.personnel.Personnel;
import entities.staff.professor.Professor;
import entities.student.Student;
import services.staff.personnel.PersonnelService;
import services.staff.professor.ProfessorService;
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
