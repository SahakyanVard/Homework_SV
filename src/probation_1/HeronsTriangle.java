package probation_1;

public class HeronsTriangle {
    static void areaOfTriangle(double a, double b, double c) {
        double S = (a + b + c) / 2;
        S = S * (S - a) * (S - b) * (S - c);
        System.out.println("AREA OF TRIANGLE IS: " + Math.sqrt(S));
    }

    public static void main(String[] args) {
        double a, b, c;
        a = 7;
        b = 8;
        c = 9;
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("INPUT IS INVALID");
            return;
        }
        areaOfTriangle(a, b, c);
    }

}
