package human;

public class Manager extends Employee {
    private String department;

    Manager(String name, String surname, String address, int age, String phoneNumber, String specialization, int salary, String department) {
        super(name, surname, address, age, phoneNumber, specialization, salary);
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
