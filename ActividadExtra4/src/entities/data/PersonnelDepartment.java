package entities.data;

public class PersonnelDepartment {
    private Department department;
    private enum Department{
        LIBRARY,
        CAFETERIA,
        CAMPUS_KEEPER,
        SECURITY,
        CLEANING
    }

    public PersonnelDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
