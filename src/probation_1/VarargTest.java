package probation_1;

public class VarargTest {
    public static void main(String[] args) {
        // Varargs
//
//        f1();
//        f1(1);
//        f1(1,8,0);
//        f1(new int  []{2,8,-9,7,6,10});

        Integer[] i = {1, 2, 3, 4, 7};
        String[] s = {"yes", "no"};
        Double[]d={-1.1,-2.2};
//        print(i);
//        print(s);
        print(i,s,d);
        System.out.println("--------------");
        System.out.println(myMax(i));
        System.out.println(myMax(d));
//        Bank_1 []b={ };
//        System.out.println(myMax(b));


    }

    static <T extends Comparable<T>> T myMax(T[] arr){
        T max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i])<0){
                max=arr[i];
            }
        }
        return max;
    }
    static <T> void print(T[]x,T[]y,T[]z){
        for (T el:x) {
            System.out.print(el+" ");
        }
        System.out.println();
        for (int i = y.length-1; i >=0; i--) {
            System.out.print(y[i]+"~");
        }
        System.out.println();
        for (T elem:z) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }


//    static void f1(int...x){
//        int c=0;
//        for (int z:x) {
//            c+=z;
//        }
//        System.out.println(c);
//    }
}
