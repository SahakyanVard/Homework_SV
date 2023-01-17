public class ForArray {
    public static void main(String[] args) {
        // How many numbers are there in the array that are greater than the previous one?
        int[] array = {1, 0, -5, -7, -9, 100};
        int quantity = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                quantity++;
            }
            }
        System.out.println("Is greater than the previous one: " + quantity);
    }
}
