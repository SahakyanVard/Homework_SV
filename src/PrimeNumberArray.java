public class PrimeNumberArray {
    public static void main(String[] args) {
        int[] positive = {45, 2, 1, 88, 5, 7, 44};

        for (int n1 = 0; n1 < positive.length; n1++) {
            int number = 0;
            for (int n2 = 2; n2 <= positive[n1] / 2; n2++) {
                if (positive[n1] % n2 == 0) {
                    number = 1;
                    break;
                }
            }
            System.out.print(number == 0 ? positive[n1] + " " : "");
        }
        System.out.println();
    }
}
