package project_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------ part 1 -------------");
        int a1 = 27;
        int b1 = 5;
        int c1 = a1 / b1;
        System.out.println(a1 == (c1 * b1));

        System.out.println("------------ part 2 -------------");
        int a = 5, b = 2, c = 3, d = 6, e = 8, f = 9;
        float x;
        float y;
        System.out.println("the arithmetic mean a, b, c = " + (x = (float)(a + b + c) / 3));
        System.out.println("the arithmetic mean d, e, f = " + (y = (float)(d + e + f) / 3));
        int xx = (int)x;
        int yy = (int)y;
        System.out.println("the sum of the whole parts " + (xx + yy));

        System.out.println("------------ part 3 -------------");


        double d1 = 34.654;
        System.out.println((float)(d1-(int)d1));

    }
}