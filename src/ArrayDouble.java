import java.util.Arrays;
public class ArrayDouble {
    public static void main(String[] args) {
        // Array of non-negative numbers.
        double[] firstArray = {33.3, 55.5, -77.7, -88.8, 99.9};
        double[] nonNegativeNumbers = new double[5];

        if (firstArray[0] >= 0) {
            nonNegativeNumbers[0] = firstArray[0];
        }
        if (firstArray[1] >= 0 && firstArray[0] >= 0) {
            nonNegativeNumbers[1] = firstArray[1];
        } else if (firstArray[1] >= 0) {
            nonNegativeNumbers[0] = firstArray[1];
        }
        if (firstArray[2] >= 0 && firstArray[1] >= 0 && firstArray[0] >= 0) {
            nonNegativeNumbers[2] = firstArray[2];
        } else if (firstArray[2] >= 0) {
            nonNegativeNumbers[0] = firstArray[2];
        }
        if (firstArray[3] >= 0 && firstArray[2] >= 0 && firstArray[1] >= 0 && firstArray[0] >= 0) {
            nonNegativeNumbers[3] = firstArray[3];
        }
        if (firstArray[4] >= 0 && firstArray[0] >= 0 && firstArray[1] >= 0 && firstArray[2] >= 0 && firstArray[3] >= 0) {
            nonNegativeNumbers[4] = firstArray[4];
        } else if (firstArray[4] >= 0 && firstArray[0] >= 0 && firstArray[1] >= 0) {
            nonNegativeNumbers[2] = firstArray[4];
        } else if (firstArray[4] >= 0 && firstArray[2] >= 0) {
            nonNegativeNumbers[1] = firstArray[4];
        }
        System.out.println("{" + firstArray[0] + "," + firstArray[1] + "," + firstArray[2] + "," + firstArray[3] + "," + firstArray[4] + "}");
        System.out.println("{" + nonNegativeNumbers[0] + "," + nonNegativeNumbers[1] + "," + nonNegativeNumbers[2] + "," + nonNegativeNumbers[3] + "," + nonNegativeNumbers[4] + "}");
    }
}