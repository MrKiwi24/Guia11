package services.student;

import entities.BasicInfo;
import entities.data.ClassCourse;
import entities.data.MaritalStatus;
import entities.student.Student;
import services.BasicInfoServices;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements StudentInterface{
    private final BasicInfoServices basicInfoServices;
    public StudentService(BasicInfoServices basicInfoServices) {
        this.basicInfoServices = basicInfoServices;
    }
    public void loadStudents(ArrayList<Student> students){
        //Me odio, así que cargué 12 personas para poder modificarlas. Esto solo se hace 1 vez mientras se compila el programa.
        ArrayList<ClassCourse> coursesBusiness =  new ArrayList<>();
        coursesBusiness.add(ClassCourse.ENGLISH);
        coursesBusiness.add(ClassCourse.BUSINESS);
        coursesBusiness.add(ClassCourse.STATISTICS);

        ArrayList<ClassCourse> coursesIT =  new ArrayList<>();
        coursesIT.add(ClassCourse.ENGLISH);
        coursesIT.add(ClassCourse.COMPUTER_SCIENCE);
        coursesIT.add(ClassCourse.INFORMATION_TECHNOLOGY);

        ArrayList<ClassCourse> coursesHuman = new ArrayList<>();
        coursesHuman.add(ClassCourse.BIOLOGY);
        coursesHuman.add(ClassCourse.HISTORY);
        coursesHuman.add(ClassCourse.GEOGRAPHY);

        ArrayList<ClassCourse> coursesScience = new ArrayList<>();
        coursesScience.add(ClassCourse.MATHS);
        coursesScience.add(ClassCourse.PHYSICS);
        coursesScience.add(ClassCourse.CHEMISTRY);


        Student student0 = new Student(95086283,
                "Maria",
                "Sol",
                "Garcilazo",
                MaritalStatus.SINGLE,
                coursesBusiness);
        students.add(student0);
        Student student1 = new Student(
                26196580,
                "Ariel",
                "David",
                "Albacete",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                coursesBusiness);
        students.add(student1);
        Student student2 = new Student(
                24837657,
                "Miguel",
                "Angel",
                "Alberdi",
                MaritalStatus.WIDOWED,
                coursesBusiness);
        students.add(student2);
        //----------------------//
        Student student3 = new Student(
                35860651,
                "Susana",
                "Pilar",
                "Adamo",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                coursesIT);
        students.add(student3);
        Student student4 = new Student(
                40510562,
                "Facundo",
                "Nicolas",
                "Sosa",
                MaritalStatus.SINGLE,
                coursesIT);
        students.add(student4);
        Student student5 = new Student(
                37997717,
                "Florencia",
                "Paola",
                "Oviedo",
                MaritalStatus.MARRIED,
                coursesIT);
        students.add(student5);
        //----------------------//
        Student student6 = new Student(
                25568258,
                "Bruno",
                "Rodrigo",
                "Osse",
                MaritalStatus.SINGLE,
                coursesHuman);
        students.add(student6);
        Student student7 = new Student(
                95871470,
                "Dario",
                "Ezequiel",
                "Garea",
                MaritalStatus.SEPARATED,
                coursesHuman);
        students.add(student7);
        Student student8 = new Student(
                35393435 ,
                "Anahi",
                "Rosaura",
                "Cerutti,",
                MaritalStatus.MARRIED,
                coursesHuman);
        students.add(student8);
        //----------------------//
        Student student9 = new Student(
                93530491 ,
                "Camila",
                "Yael",
                "Buenavida",
                MaritalStatus.DIVORCED,
                coursesScience);
        students.add(student9);
        Student student10 = new Student(
                41325196,
                "Natalia",
                "Micaela",
                "Pertinencia",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                coursesScience);
        students.add(student10);
        Student student11 = new Student(
                18029282,
                "Hector",
                "Nicolas",
                "Ferreyra ",
                MaritalStatus.SINGLE,
                coursesScience);
        students.add(student11);
        //----------------------//
    }

    @Override
    public void registerNewStudent(ArrayList<Student> students) {
        Scanner read = new Scanner(System.in);

        BasicInfo basicInfo = basicInfoServices.register();

        ArrayList<ClassCourse> courses = new ArrayList<>();
        loop: while (true){
            System.out.println("Press 0 to stop adding courses");

            System.out.println("1 => MATHS");
            System.out.println("2 => CHEMISTRY");
            System.out.println("3 => PHYSICS");
            System.out.println("4 => GEOGRAPHY");
            System.out.println("5 => HISTORY");
            System.out.println("6 => BIOLOGY");
            System.out.println("7 => COMPUTER SCIENCE");
            System.out.println("8 => INFORMATION TECHNOLOGY");
            System.out.println("9 => STATISTICS");
            System.out.println("10 => BUSINESS");
            System.out.println("11 => ENGLISH");
            int course = Integer.parseInt(read.nextLine());

            switch(course) {
                case 1 -> courses.add(ClassCourse.MATHS);
                case 2 -> courses.add(ClassCourse.CHEMISTRY);
                case 3 -> courses.add(ClassCourse.PHYSICS);
                case 4 -> courses.add(ClassCourse.GEOGRAPHY);
                case 5 -> courses.add(ClassCourse.HISTORY);
                case 6 -> courses.add(ClassCourse.BIOLOGY);
                case 7 -> courses.add(ClassCourse.COMPUTER_SCIENCE);
                case 8 -> courses.add(ClassCourse.INFORMATION_TECHNOLOGY);
                case 9 -> courses.add(ClassCourse.STATISTICS);
                case 10 -> courses.add(ClassCourse.BUSINESS);
                case 11 -> courses.add(ClassCourse.ENGLISH);
                case 0 -> {
                    if (courses.size() == 0){
                        System.out.println("You have to enlist to AT LEAST one course.");
                    } else {
                        break loop;
                    }
                }
                default -> System.out.println("Incorrect value");
            }

        }
        Student student = new Student(
                basicInfo.getPersonID(),
                basicInfo.getPersonFirstName(),
                basicInfo.getPersonMiddleName(),
                basicInfo.getPersonLastName(),
                basicInfo.getMaritalStatus(),
                courses);

        students.add(student);
    }

    @Override
    public void fetchStudentInfo(Student student) {
        basicInfoServices.fetchBasicInfo(student);
        System.out.println("Enlisted Courses: " + student.getEnlistedCourses());
    }

    @Override
    public Student updateStudentInfo(Student oldStudent) {
        return null;
    }

    @Override
    public Student deleteStudent(Student studentToDelete) {
        return null;
    }
}
