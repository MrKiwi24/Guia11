package services.student;

import entities.BasicInfo;
import entities.data.ClassCourse;
import entities.data.MaritalStatus;
import entities.student.Student;
import services.BasicInfoService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements StudentInterface{
    private final BasicInfoService basicInfoServices;
    public StudentService(BasicInfoService basicInfoServices) {
        this.basicInfoServices = basicInfoServices;
    }
    Scanner read = new Scanner(System.in);
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
        Student student1 = new Student(
                26196580,
                "Ariel",
                "David",
                "Albacete",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                coursesBusiness);
        Student student2 = new Student(
                24837657,
                "Miguel",
                "Angel",
                "Alberdi",
                MaritalStatus.WIDOWED,
                coursesBusiness);
        //----------------------//
        Student student3 = new Student(
                35860651,
                "Susana",
                "Pilar",
                "Adamo",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                coursesIT);
        Student student4 = new Student(
                40510562,
                "Facundo",
                "Nicolas",
                "Sosa",
                MaritalStatus.SINGLE,
                coursesIT);
        Student student5 = new Student(
                37997717,
                "Florencia",
                "Paola",
                "Oviedo",
                MaritalStatus.MARRIED,
                coursesIT);
        //----------------------//
        Student student6 = new Student(
                25568258,
                "Bruno",
                "Rodrigo",
                "Osse",
                MaritalStatus.SINGLE,
                coursesHuman);
        Student student7 = new Student(
                95871470,
                "Dario",
                "Ezequiel",
                "Garea",
                MaritalStatus.SEPARATED,
                coursesHuman);
        Student student8 = new Student(
                35393435 ,
                "Anahi",
                "Rosaura",
                "Cerutti,",
                MaritalStatus.MARRIED,
                coursesHuman);
        //----------------------//
        Student student9 = new Student(
                93530491 ,
                "Camila",
                "Yael",
                "Buenavida",
                MaritalStatus.DIVORCED,
                coursesScience);
        Student student10 = new Student(
                41325196,
                "Natalia",
                "Micaela",
                "Pertinencia",
                MaritalStatus.REGISTERED_PARTNERSHIP,
                coursesScience);
        Student student11 = new Student(
                18029282,
                "Hector",
                "Nicolas",
                "Ferreyra ",
                MaritalStatus.SINGLE,
                coursesScience);


        students.add(student0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        //----------------------//
    }
    @Override
    public void registerNewStudent(ArrayList<Student> students) {
        Scanner read = new Scanner(System.in);
        Student student = new Student();

        student.setBasicInfo(basicInfoServices.register());

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
        student.setEnlistedCourses(courses);
        students.add(student);
    }
    @Override
    public void fetchStudentInfo(Student student) {
        basicInfoServices.fetchBasicInfo(student);
        System.out.println("Enlisted Courses: " + student.getEnlistedCourses());
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    }
    @Override
    public void updateStudentInfo(Student oldStudent) {
        Student updatedStudent = Student.copy(oldStudent);
        fetchStudentInfo(updatedStudent);

        System.out.println("1 => EDIT basic info");
        System.out.println("2 => ADD courses");
        System.out.println("3 => DELETE courses");
        int updateOption = Integer.parseInt(read.nextLine());

        loop:
        while (true) {
            switch (updateOption) {
                case 1 -> {updatedStudent.setBasicInfo(basicInfoServices.update(updatedStudent));break loop;}
            }
        }
        //TODO: confirmación de los cambios. Agregar y sacar cursos.
        oldStudent.setBasicInfo(updatedStudent);
        oldStudent.setEnlistedCourses(updatedStudent.getEnlistedCourses());
    }

    @Override
    public Student deleteStudent(Student studentToDelete) {
        return null;
    }
}
