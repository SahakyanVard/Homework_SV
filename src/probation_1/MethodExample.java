package probation_1;

public class MethodExample {
    public static void main(String[] args) {
//        // 1. Greatest Of Two Numbers.
//
//        int num1 = 100, num2 = 10, temp;
//        if (num1 == num2)
//            System.out.println("Both numbers are Equal\n");
//        else {
//            temp = num1 > num2 ? num1 : num2;
//            System.out.println(temp + " is the largest");
//        }
//
//        //2. Sum Of Digits Of a Number.
//
//        int num = 1111711111;
//        System.out.println("Sum of digits: " + getSumOfDigits(num));
//    }
//
//    static int getSumOfDigits(int num) {
//        if (num == 0)
//            return 0;
//        return (num % 10) + getSumOfDigits(num / 10);
//    }

    //3. Reverse a number using recursion.

    int number = 123456789, reverse = 0;
        System.out.println("Reversed number is: "+ getReverse(number, reverse));}
    static int getReverse(int number, int reverse) {
        if (number == 0)
            return reverse;
        int rem = number % 10;
        reverse = reverse * 10 + rem;
        return getReverse(number / 10, reverse);
    }
}
