package entities.data;

public class MaritalStatus {
    private maritalStatus maritalStatus;
    private enum maritalStatus {
        SINGLE,
        MARRIED,
        DIVORCED,
        SEPARATED,
        WIDOWED,
        REGISTERED_PARTNERSHIP;
    }

    public MaritalStatus() {
    }

    public MaritalStatus(MaritalStatus.maritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public MaritalStatus.maritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus.maritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
