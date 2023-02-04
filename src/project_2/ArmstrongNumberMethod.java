package project_2;
import java.util.Scanner;
public class ArmstrongNumberMethod {
    // Armstrong number example 9474=9^4+ 4^4+ 7^4+ 4^4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int number, temp, rem=1, pow=1, i=0,tD = 0, result = 0;
        number = input.nextInt();
        temp = number;
        System.out.println(arstrongNumber(number,tD,temp,rem, i, pow, result));
    }
   public static int arstrongNumber(int number,int tD, int temp, int rem, int pow, int i, int result){
        while (number > 0) {
            number = number / 10;
            tD++;
        }
        number = temp;
        while (number > 0) {
            rem = number % 10;
            pow = 1;
            i = 0;
            while (i < tD) {
                pow *= rem;
                i++;
            }
            result += pow;
            number = number / 10;
        }
        System.out.println(result == temp?"Armstrong number": "Not Armstrong number");
        return temp;
    }
}
