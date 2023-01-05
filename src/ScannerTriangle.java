import java.util.Scanner;

public class ScannerTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter a of a triangle: ");
        a = scanner.nextInt();
        System.out.println("Please enter the b of a triangle: ");
        b = scanner.nextInt();
        System.out.println("Please enter the c of a triangle: ");
        c = scanner.nextInt();
        System.out.println("Are the sides of your triangle։ " + "\n" + a + "\n" + b + "\n" + c);
        // The length of each segment must be less than the sum of the other two

        if (((a + b) > c && (a + c) > b && (c + b) > a) && a > 0 && b > 0 && c > 0) {
            System.out.println("A triangle has been created․");
        } else {
            System.out.println("A triangle cannot be formed with such sides․");
        }

    }
}
