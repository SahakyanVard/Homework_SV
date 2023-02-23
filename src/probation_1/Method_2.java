package probation_1;

public class Method_2 {
    String cardUser, date;
   private String cardName="VISA";
    short cardCode;
    long cardNumber;
    public void bankHello(){
        System.out.println("FastBank");
    }
    public void callF(){
        System.out.println(cardName);
    }
    public String call1(){
        return cardName;
    }
    public long getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(long n){

        if (n>0&&n<=9999999999999999l) {
            cardNumber=n;
        }
    }

}
