package project_1;

public class MaxArray {
    public static void main(String[] args) {
        int[] array = {20, -5, 0, 8, -2, 9,500};
        int max = array[0];
        for (int maximum : array) {
            if (maximum > max) {
                max = maximum;
            }
        }
        System.out.println(max);
    }
}
