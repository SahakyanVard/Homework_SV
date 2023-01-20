public class PrimeNumberArray {
    public static void main(String[] args) {
        int[] positive = {44, 55, 66, 88, 99,100};
        int number = 1;
        for (int n1 = 0; n1 < positive.length; n1++) {
            number = 0;
            for (int n2 = 2; n2 <= positive[n1] / 2; n2++) {
                if (positive[n1] % n2 == 0) {
                    number = 1;
                    break;
                }
            }
            System.out.print(number == 0 ? positive[n1] + " " : "");
        }
        System.out.println();
        System.out.print(number == 1 ? "The prime number is not find." : "");
    }
}
