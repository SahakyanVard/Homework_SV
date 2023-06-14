package probation_1;
import  probation_1.Convert;
import java.util.Scanner;
public class Method_1 {
      public Bank_1 createBank(){
          Scanner s=new Scanner(System.in);
          Bank_1 bank_1=new Bank_1();
          System.out.println(" Enter input name");
          System.out.println(" Enter input card name");
          bank_1.setCardName(s.next());
          System.out.println(" Enter input card number");
          bank_1.setCardNumber(s.nextLong());
          System.out.println(" Enter input is yes or no");
          bank_1.setBank(s.next().charAt(0)=='y');
          return bank_1;
      }
public void printCardName(Bank_1 bank_1){
    System.out.println(Bank_1.NAME+" "+bank_1.getCardName());
}

public void printBC(Bank_1 bank_1){
              System.out.println(bank_1.isBank()?"Is Bank":"Is not a Bank");
}

public String banking(Bank_1 bank_1,Bank_1 bank_2){
          return bank_1.getCardNumber()+"\n"+bank_2.getCardNumber();
}

public void bankArray(Bank_1[]bank){
    for (Bank_1 array:bank) {
        array.printInfo();
    }
}
    }


