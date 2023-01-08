import java.util.Arrays;
public class ArrayDouble {
    public static void main(String[] args) {
        // Array of non-negative numbers.
        double[] firstArray = {33.3, 55.5, -77.7, -88.8, -99.9};
        System.out.println(Arrays.toString(firstArray));
        double[] nonNegativeNumbers = new double[5];
        System.out.print((firstArray[0] >= 0 ? firstArray[0] : nonNegativeNumbers[0]) + " ");
        System.out.print((firstArray[1] >= 0 ? firstArray[1] : nonNegativeNumbers[1]) + " ");
        System.out.print((firstArray[2] >= 0 ? firstArray[2] : nonNegativeNumbers[2]) + " ");
        System.out.print((firstArray[3] >= 0 ? firstArray[3] : nonNegativeNumbers[3]) + " ");
        System.out.print((firstArray[4] >= 0 ? firstArray[4] : nonNegativeNumbers[4]) + " ");

        nonNegativeNumbers[0] = firstArray[0];
        nonNegativeNumbers[1] = firstArray[1];
        System.out.println("\n");
        System.out.println(Arrays.toString(nonNegativeNumbers));
}
}
