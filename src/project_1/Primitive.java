package project_1;

import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        //Որ ՞էլեմենտը զույգ չունի
//     int[]x={1,1,2,2,5,5,7};
// int rez=x[0];
//        for (int i = 1; i < x.length; i++) {
//            rez=rez^x[i];
//        }
//        System.out.println(rez);
//    }

//Գտնել պարզ թվերը։ Այսինքն Բաժանվոիմ են իրենց վրա ու մեկի։
        int[] arPrime = {7, 13, 2, 4, 8, 6};
        int counter = 0;
        for (int i = 0; i < arPrime.length; ++i) {
            boolean isPrime = false;
            for (int j = 2; j <= arPrime[i] / 2; j++) {
                if (arPrime[i] % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                counter = 0;
                System.out.print(arPrime[i] + " ");
            }
        }
        if (counter == 1) {
            System.out.println("Is not Prime");
        }
    }
}
