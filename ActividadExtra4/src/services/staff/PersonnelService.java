package services.staff;

import entities.staff.Personnel;
import entities.student.Student;
import services.BasicInfoService;

import java.util.ArrayList;

public class PersonnelService {
    private final BasicInfoService basicInfoServices;
    private final ArrayList<Personnel> personnels;
    public PersonnelService(BasicInfoService basicInfoServices, ArrayList<Personnel> personnels) {
        this.basicInfoServices = basicInfoServices;
        this.personnels = personnels;
    }
    public void loadPersonnels(){

    }
}
