package interface2023;

import probation_1.Bank_1;

public class Interface_1 extends Bank_1 implements InterfaceExaple, InterEx {
    @Override
    public void writeCode(String x) {
        System.out.println("java");
    }

    @Override
    public String language() {
        return "ok Google";
    }

    @Override
    public void readeCode() {
        System.out.println("JavaScript");
    }

    @Override
    public void x() {
        System.out.println(" It is X function");
    }

    @Override
    public void exaple(int x) {
        System.out.println("Hello 2023");
    }

    @Override
    public String exaple1() {
        return "This is Java";
    }

    public static void main(String[] args) {
        System.out.println( InterfaceExaple.NAME);
    }
}
