package probation_1;

public class InsertionSort {
    public static void insertionSortExample(int array[]) {
        int l = array.length;
        for (int i = 1; i < l; i++) {
            int key = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {100,4, -5, 7, 9, 3, 2, 45, 0, 88};
        System.out.println("Before Sort");
        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.println();
        insertionSortExample(array1);
        System.out.println("After Sort");
        for (int j : array1) {
            System.out.print(j + " ");
        }
    }
}
