package throwableExceptionError;

public class Asserts {
    // Asserts just for testing
    public static void main(String[] args) {

        int n=8;
//        assert n>0;
//        System.out.println(" END");

        assert sum(2)==3:"is true";
        assert sum(0)==0:"0-i depq";
        assert sum(-1)==0;
        System.out.println("fine");
    }

   static int sum(int n){
        return n+1;
    }
}
