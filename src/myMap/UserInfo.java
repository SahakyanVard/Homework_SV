package myMap;

public class UserInfo {
    private String nameSurname;
    private String passportId;
    private String phoneNumber;
    private int age;
    private boolean isOverdue;

    public UserInfo(String nameSurname, String passportId, String phoneNumber, int age, boolean isOverdue) {
        this.nameSurname = nameSurname;
        this.passportId = passportId;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.isOverdue = isOverdue;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setOverdue(boolean overdue) {
        isOverdue = overdue;
    }

    @Override
    public String toString() {
        return nameSurname+" \n"+passportId+"\n"+phoneNumber+"\nisOverdue:"+isOverdue;
    }

    // TODO: 6/20/2023
}
