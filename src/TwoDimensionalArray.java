public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Print the first and last elements of a two-dimensional array.
        int[][] twoD;
        twoD = new int[][]{
                {999, 888, 777, 666, 555},
                {1, 2, 3, 4, 11},
                {-121, 0, -50, -100, -1000},
                {0,0,0,5,8}
        };
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j += twoD[i].length - 1) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
