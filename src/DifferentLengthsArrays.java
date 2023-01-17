public class DifferentLengthsArrays {
    public static void main(String[] args) {
        //Two-dimensional arrays of different lengths
        int[][] twoDDL;
        twoDDL = new int[][]{
                {11, 22, 33},
                {44, 55},
                {66, 77, 88, 99},
                {0,1,2,3,4,5,6,7,8,9}
        };
        int index = 0;
        for (int i = 0; i < twoDDL.length; i++) {
            if (twoDDL[i].length > twoDDL[index].length) {
                index = i;
            }
        }
        for (int i = 0; i < twoDDL[index].length; i++) {
            System.out.print(twoDDL[index][i] + ",");
        }
        }
    }

