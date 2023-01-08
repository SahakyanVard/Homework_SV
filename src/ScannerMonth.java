import java.util.Scanner;

public class ScannerMonth {
    public static void main(String[] args) {
        System.out.println("Please enter the month number [1-12]։ ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(month + " " + "month has " + 31 + " days");
                break;
            case 4, 6, 9, 11:
                System.out.println(month + " " + "month has " + 30 + " days");
                break;
            case 2:
                System.out.println(month + " " + "month has " + 28 + " days");
                break;
            default:
                System.out.println("Month numbers should be in the range [1-12].");

                // Terminate JVM
                if (month >= 1 && month <= 12) {
                System.out.println("Month numbers range [1-12].");
                System.exit(0);
                }
        }

    }
}
