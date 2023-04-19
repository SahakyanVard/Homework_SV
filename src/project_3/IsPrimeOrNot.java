package project_3;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        int number = 10;
        boolean flag = false;
        for (int i = 2; i <=number/2 ; ++i) {
         //Condition for nonprime number.
            if (number%i==0) {
                flag=true;
                break;
            }
        }
        System.out.println(!flag?number+ " is a prime number":number+ " is not a prime number");
    }
}
