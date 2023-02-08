package project_2;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        printIsPrime(47);
    }

    public static boolean isPrimeMethod(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void printIsPrime(int i) {
        if ((isPrimeMethod(i))) {
            System.out.println(i + " is prime");
        }
    }
}