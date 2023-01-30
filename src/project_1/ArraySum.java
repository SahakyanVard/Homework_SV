package project_1;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 2, -1, 3,-1,0,3};
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                x = i;
                break;
            }
        } System.out.println(x);
        // index of negative element  is 2
        int sum=0;
        for (int i = 3; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
