package educationalSystem;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        //  Salary multiplier can be in the range 1.5-2․
        Scanner coefficient = new Scanner(System.in);
        System.out.println("Enter coefficient number: ");
        final double MULTIPLIER = coefficient.nextDouble();
        if (MULTIPLIER > 2 || MULTIPLIER < 1.5) {
            System.out.println("Incorrect input" + "\n Salary multiplier can be in the range 1.5-2");
            System.exit(1);
        }

        Teacher t = new Teacher();
        System.out.println(t.getSpecialist() + " " + t.getNameSurname() + "-" + t.getSalary());

        HeadTeacher ht = new HeadTeacher();
        System.out.println(ht.getSpecialist() + " " + ht.getNameSurname() + "-" + (ht.getSalary() * MULTIPLIER));

        SchoolDirector sd = new SchoolDirector();
        System.out.println(sd.getSpecialist() + " " + sd.getNameSurname() + "-" + sd.getSdS());

    }

}
