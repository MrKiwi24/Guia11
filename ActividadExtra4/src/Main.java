import entities.staff.Personnel;
import entities.staff.Professor;
import entities.student.Student;
import services.CollegeService;

import java.util.ArrayList;

public class Main {
    public static CollegeService collegeService = new CollegeService();

    public static void main(String[] args) {
        //Load the lists with hardcoded data for testing and app usage.
        collegeService.loadPeople();

        collegeService.mainMenu();
    }
}