package educationalSystem;

public class Teacher {
    private String specialist = "Teacher";
    private String nameSurname = "Smbat Smbatyan";
    private double salary = 108000;

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialist() {
        return specialist;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public double getSalary() {
        return salary;
    }
}
