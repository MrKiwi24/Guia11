package services.staff;
import entities.data.ClassCourse;
import entities.data.MaritalStatus;
import entities.staff.Personnel;
import entities.staff.Professor;
import services.BasicInfoService;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProfessorService {
    private final BasicInfoService basicInfoServices;
    private final ArrayList<Professor> professors;
    public ProfessorService(BasicInfoService basicInfoServices, ArrayList<Professor> professors) {
        this.basicInfoServices = basicInfoServices;
        this.professors = professors;
    }
    public void loadProfessors() {

        Professor professor0 = new Professor(26569637,
                "Pedro",
                "Alejandro",
                "Yardin",
                MaritalStatus.SEPARATED,
                LocalDate.of(2001, 04, 19),
                101,
                ClassCourse.MATHS);

        Professor professor1 = new Professor(
                26321075,
                "Erica",
                "María",
                "Ojeda",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                LocalDate.of(2005, 03, 05),
                201,
                ClassCourse.COMPUTER_SCIENCE);

        Professor professor2 = new Professor(22165419,
                "Ruben",
                "Rolando",
                "Rivero",
                MaritalStatus.MARRIED,
                LocalDate.of(2003, 02, 21),
                102,
                ClassCourse.PHYSICS);

        Professor professor3 = new Professor(29121391,
                "Aldana",
                "Maribel",
                "Pierotti",
                MaritalStatus.WIDOWED,
                LocalDate.of(1997, 05, 29),
                103,
                ClassCourse.STATISTICS);

        Professor professor4 = new Professor(24275728,
                "Alejandro",
                "Gabriel",
                "Medrano",
                MaritalStatus.MARRIED,
                LocalDate.of(1999, 02, 05),
                202,
                ClassCourse.GEOGRAPHY);

        Professor professor5 = new Professor(26809637,
                "Luana",
                "Belén",
                "Nicolini",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                LocalDate.of(2003, 9, 12),
                203,
                ClassCourse.HISTORY);

        Professor professor6 = new Professor(23880253,
                "Ogando",
                "Magalí",
                "Roxana",
                MaritalStatus.SINGLE,
                LocalDate.of(1997, 7, 6),
                204,
                ClassCourse.ENGLISH);

        Professor professor7 = new Professor(29610700,
                "Nadia",
                "Martina",
                "Portillo",
                MaritalStatus.MARRIED,
                LocalDate.of(2000, 10, 31),
                301,
                ClassCourse.INFORMATION_TECHNOLOGY);

        Professor professor8 = new Professor(24249796,
                "Candela",
                "Rocio",
                "Moto",
                MaritalStatus.DIVORCED,
                LocalDate.of(2002, 3, 15),
                302,
                ClassCourse.BUSINESS);

        Professor professor9 = new Professor(29538803,
                "Lara",
                "Carmen",
                "Soto",
                MaritalStatus.SEPARATED,
                LocalDate.of(2010, 10, 20),
                303,
                ClassCourse.CHEMISTRY);

        Professor professor10 = new Professor(31521287,
                "Victoria",
                "Irina",
                "Yonas",
                MaritalStatus.MARRIED,
                LocalDate.of(1996, 03, 20),
                304,
                ClassCourse.BIOLOGY);

        professors.add(professor0);
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);
        professors.add(professor4);
        professors.add(professor5);
        professors.add(professor6);
        professors.add(professor7);
        professors.add(professor8);
        professors.add(professor9);
        professors.add(professor10);
    }
}
