package probation_1;
public class SubMatrix {
    public static void main(String[] args) {
        int line, top;
        int a1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int a2[][] = {{6, 2, -2}, {4, 0, -4}, {2, -2, -6}};
        line = a1.length;
        top = a2.length;
        int diff[][] = new int[line][top];
        System.out.println("Before flipping the matrix");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < top; j++) {
                diff[i][j] = a1[i][j] + a2[i][j];
                System.out.print(a1[i][j]+" " );
            }
            System.out.println();
        }
        System.out.println("Tilt the matrix to the right.\n RESULT: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < top; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}
