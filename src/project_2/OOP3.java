package project_2;

public class OOP3 {
    public static void main(String[] args) {
        int matrix[][][] = {{{-55}, {9, 9, 9}},{{1, 1, 1}, {2, 2}, {100, 200, 300, 400, 500}}};
        matrixArrayMethod2(matrix);
    }

    public static void matrixArrayMethod2(int matrix[][][]) {
        for (int[][] m1 : matrix) {
            for (int[] m2 : m1) {
                for (int m3:m2) {
                    System.out.print(m3 + " ");
                }
            }
        }
    }
}
