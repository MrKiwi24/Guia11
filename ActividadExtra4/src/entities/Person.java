package entities;

import entities.data.MaritalStatus;

public class Person {
    protected long personID;
    protected String personFirstName;
    protected String personMiddleName;
    protected String personLastName;
    protected MaritalStatus maritalStatus;

    public Person() {
    }

    public Person(long personID, String personFirstName, String personMiddleName, String personLastName, MaritalStatus maritalStatus) {
        this.personID = personID;
        this.personFirstName = personFirstName;
        this.personMiddleName = personMiddleName;
        this.personLastName = personLastName;
        this.maritalStatus = maritalStatus;
    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonMiddleName() {
        return personMiddleName;
    }

    public void setPersonMiddleName(String personMiddleName) {
        this.personMiddleName = personMiddleName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
