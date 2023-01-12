public class ArrayThree {
    public static void main(String[] args) {
        //Create arry3 from array1 & arry2
        int[] arr1 = {4, 3, 89, 6, 45, 36, 99, 20, 100, 57};
        int[] arr2 = {8, 6, 7, 150, 48, 88, 63, 11, 10, 9};
        int[] arr3 = new int[arr1.length];
        int i = 0;
        for (i = 0; i < arr3.length; i++) {
            if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[i] = arr2[i];
            } else if (arr1[i] % 2 != 0 && arr2[i] % 2 != 0) {
                arr3[i] = arr1[i];
            } else arr3[i] = 0;
        }
        for (i = 0; i < arr3.length; ++i) {
            System.out.print(arr3[i] + ",");
        }
    }
}
