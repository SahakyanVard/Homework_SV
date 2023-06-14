package probation_1;

public class Recursion {
    public static void main(String[] args) {

       System.out.println(factoryal(5));
        System.out.println(factorialRecurs(5));
        System.out.println(fibonachy(7));
    }
    // 5!=5*4*3*2*1
    public static int factoryal(int n){
        int count=1;
        for (int i = 1; i <=n ; i++) {
            count*=i;
        }
        return count;
    }
    //Recursion
    public static int factorialRecurs(int n){
        if (n==0||n==1){
            return 1;
        }return n*factorialRecurs(n-1);
    }

    //Fibonachy 1,1,2,3,5,8,13,21,34...
    public static int fibonachy(int n){
        if (n==1||n==2)
            return 1;
        return fibonachy(n-1)+fibonachy(n-2);
    }
}
