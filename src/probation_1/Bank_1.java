package probation_1;

public class Bank_1 {
    static {
        System.out.println("This is Fast bank");

        cardNumber=1234567890777777l;
    }

    static class X{
        int x1=88;
    }
    public final static String NAME="ACBA";
    private String cardName;
    private boolean isBank;
    public static long cardNumber;
    public static void statF(int a,int b){
        System.out.println(a+b);
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void printInfo(){
        System.out.printf("BankName=%s,CardName=%s,CardNumber=%d,isBank =%s\n", NAME,cardName,cardNumber,isBank?"yes":"no");
    }
    public boolean isBank() {
        return isBank;
    }

    public void setBank(boolean bank) {
        isBank = bank;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
