package project_2;
import java.util.Scanner;
public class OOP2 {
    public static void main(String[] args) {
        int matrix[][]={{9,9,9},{1,1,1},{2,2}, {100,200,300,400,500}};
        matrixArrayMethod1(matrix);
    }

    public static void matrixArrayMethod1(int matrix[][]) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}