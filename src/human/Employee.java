package human;

public class Employee extends Person {


    private String specialization;
    private int salary;

    Employee(String name, String surname, String address, int age, String phoneNumber, String specialization, int salary) {
        super(name, surname, address, age, phoneNumber);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
