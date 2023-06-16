package throwableExceptionError;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            System.out.println(a / b);
            System.out.println(args[1]);
            FileReader fr=new FileReader("Proj_homeworke.iml");

        }
//        catch (ArithmeticException e) {
//            System.out.println("it is unchecked exception");
//        }
//
        catch (FileNotFoundException | ArrayIndexOutOfBoundsException e){
            System.out.println("This is checked exception and it is args");
        }
        catch (java.lang.Exception e){
            System.out.println("FULL exception");
        }
//        finally {
//            System.out.println("it is EXCEPTION");
//        }
        try {String s=null;
            System.out.println(s.length());

        }  catch (NullPointerException e1){
            System.out.println("it is null");
        }

        try {String s1="sss";
            System.out.println(s1.charAt(5));

        }
//        catch (StringIndexOutOfBoundsException i){
//            i.printStackTrace();
//        }
        finally {
            System.out.println("65464646");
        }


    System.out.println("end");
    }
}
