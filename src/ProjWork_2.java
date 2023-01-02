public class ProjWork_2 {
    public static void main(String[] args) {

        // First issue (==) /integer number/
//        int x, y;
//        x = 25;
//        y = 5;
//        System.out.println(x / y == 5);
//        System.out.println(x / y != 5);
//
//        // Second issue   arithmetic average /integer number/
//
//        int a, b, c, d, e, f;
//        a = 7;
//        b = 1;
//        c = 2;
//        double m1 = (double)(a + b + c) / 3;
//        System.out.println(m1);
//        d =10;
//        e = 4;
//        f = 5;
//        double m2 =(double) (d+e+f)/3;
//        System.out.println(m2);
//        int sum = (int) (m1 + m2);
//        System.out.println(sum);
//
//        // Third issue /double in decimal/
//        double d1 = 88.777;
//        System.out.println((float)(d1-(int)d1));

        // SECOND VERSION

        // First issue (==) /integer number/
        byte x;
        long y;

        x = 20;
        y = -1920000000000L;
        System.out.println(x / y == 0);
        System.out.println(x / y != 0);

        // Second issue   arithmetic average /integer number/

        byte a;
        int b;
        short c;
        long d;
        int e;
        long f;
        a = 50;
        b = -78;
        c = -100;
        double m1 = (double) (a + b + c) / 3;
        System.out.println(m1);
        d = -789789L;
        e = 555;
        f = 579579L;

        double m2 = (double) (d + e + f) / 3;
        System.out.println(m2);
        long sum = (long) (m1 + m2);
        System.out.println(sum);

        // Third issue /double in decimal/
        double d1 = 88.777;
        System.out.println((float)(d1-(int)d1));



    }
}
