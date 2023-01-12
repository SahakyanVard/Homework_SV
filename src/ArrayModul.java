public class ArrayModul {
    public static void main(String[] args) {
        // Replaced their numbers with their modulus.
        int[] moduleArray = {0, -100, -500, 70, 50, 999, -77, 0};

        int number = 0;
        for (int i = 0; i < moduleArray.length; i++) {
            if (moduleArray[i] < 0) {
                moduleArray[i] = moduleArray[i] * (-1);
                number++;
            }
        }
        for (int j = 0; j < moduleArray.length; j++) {
            System.out.print(moduleArray[j] + ",");
        }
        System.out.println();
        System.out.println("Number of changes: " + number);
        System.out.println("The number of non-negative terms: " + (moduleArray.length - number));
    }
}
