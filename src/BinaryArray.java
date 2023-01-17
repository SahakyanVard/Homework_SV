public class BinaryArray {
    public static void main(String[] args) {
        //Get a decimal number from a binary array.
        int[] binary = {1, 0, 0, 0, 1, 0};
        int []decimal={32,16,8,4,2,1};
        int sum = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i]==1){
                binary[i]=decimal[i];
                sum+=binary[i];
            }
        }
        System.out.println(sum);
    }
}
