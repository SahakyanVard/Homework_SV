package project_2;

import java.util.Scanner;

public class OOP_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the valid input a (1 to 10), b (-10 to 10)");
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        if (a > 10 || b > 10 || a < -10 || b < -10 || (a < 1 && a > -11)) {
            System.out.println("input is not correct");
            System.exit(0);
        }
        System.out.println(powerF(a, b));
    }

    public static double powerF(int a, int b) {
        double power = 1;
        if (a < 1 && a > -11) {
            return -2;
        } else if (a > 10 || b > 10 || a < -10 || b < -10) {
            return -1;
        }
        if (b > 0) {
            power = a * (powerF(a, b - 1));
            return power;
        } else if (b < 0) {
            power = 1/(a * (powerF(a, -(b + 1))));
            return power;
        } else
            return 1;
    }
}
