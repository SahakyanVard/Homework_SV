package throwableExceptionError;

import java.util.Scanner;

public class MyException {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-Z][a-z]+")) {
            this.name = name;
        } else throw new NameException();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws YearException {
        if (year >= 1905 && year <= 2022)
            this.year = year;
        else
            throw new YearException(year);
    }

    public static void main(String[] args) {
//        MyException myException = new MyException();
//        try {
//            myException.setName("Asss");
//            System.out.println(myException.getName());
//        } catch (NameException n) {
//        }

//        try {
//            myException.setYear(1900);
//            System.out.println(myException.getYear());
//        }catch (YearException e){
//           e.printStackTrace();
//    }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter name");
//        while (true) {
//            String name = scanner.nextLine();
//
//            try {
//                myException.setName(name);
//                System.out.println("THANKS " + myException.getName());
//                break;
//            } catch (NameException e) {
//                System.out.println("name is invalid.\n Please try again");
//            }
//        }


//        String ss = "78.88n";
//        System.out.println(inNumber(ss));
//        System.out.println(Double.parseDouble("78.99"));


    }

//    private static boolean inNumber(String ss) {
//       try {Double.parseDouble(ss);
//           return true;
//       }catch (NumberFormatException e){
//           return false;
//       }
//    }

}
