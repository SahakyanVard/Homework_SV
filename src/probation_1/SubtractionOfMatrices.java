package probation_1;

public class SubtractionOfMatrices {
    public static void main(String[] args) {
        int line, top;
        int a1[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int a2[][] = {{0, 0, 0}, {1, 1, 1}, {2, 2, 2}};
        line = a1.length;
        top = a1[0].length;
        int diff[][] = new int[line][top];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < top; j++) {
                diff[i][j] = a1[i][j] - a2[i][j];
            }
        }
        System.out.println("Subtraction of Matrices: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < top; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}
