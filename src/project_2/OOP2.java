package project_2;

public class OOP2 {
    public static void main(String[] args) {
        int matrix[][] = {{9, 9, 9},
                          {1, 1, 1, 1,1},
                          {2, 2,0,-5,-9,-7,-3}};
        matrixArrayMethod1(matrix);
    }

    public static void matrixArrayMethod1(int matrix[][]) {
        int[] array = new int[matrix[0].length+matrix[1].length+matrix[2].length];
        int element=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[element] = matrix[i][j];
                ++element;
            }
        }
        for (int arr :array) {
            System.out.print(arr+" ");
        }
    }
}
