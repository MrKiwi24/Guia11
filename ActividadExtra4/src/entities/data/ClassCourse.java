package entities.data;

public class ClassCourse {
    private classCourse classCourse;

    private enum classCourse{
        MATHS,
        CHEMISTRY,
        PHYSICS,
        GEOGRAPHY,
        HISTORY,
        BIOLOGY,
        COMPUTER_SCIENCE,
        INFORMATION_TECHNOLOGY,
        STATISTICS,
        BUSINESS,
        ENGLISH
    }

    public ClassCourse() {
    }

    public ClassCourse(ClassCourse.classCourse classCourse) {
        this.classCourse = classCourse;
    }

    public ClassCourse.classCourse getClassCourse() {
        return classCourse;
    }

    public void setClassCourse(ClassCourse.classCourse classCourse) {
        this.classCourse = classCourse;
    }
}
