package project_2;
public class OOP2 {
    public static void main(String[] args) {
        int matrix[][] = {{0,1},
                          {2, 3},
                          {4, 5, 6,7},
                          {8,9}};

        matrixArrayMethod1(matrix);
   }
    public static void matrixArrayMethod1(int matrix[][]) {
        int element = 0;
        int length=0;
        for (int i = 0; i < matrix.length ; i++) {
            length+=matrix[i].length;
        }

        int[] array = new int[length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[element] = matrix[i][j];
                ++element;
            }
        }
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
