package financialSystem;

public class BankCard {
    private String cardType;
    private String cardUser;
    private long cardNumber;
    private int cvv;
    private String cardExpiryDate;

    public double cardBalanceADD(double balanceAdd) {
        if (balanceAdd == 0) {
            System.out.println("This balance is 0.");
        }
        return balanceAdd;
    }

    public double cardBalanceDecrease(double balanceDecrease) {
        if (balanceDecrease == 0) {
            System.out.println("This balance is 0.");
        }
        return balanceDecrease;
    }

    public void onlineShopping() {
        System.out.println(cardType + " have a online shopping for users");
    }

    public void cardSHows() {
        System.out.println(cardType + "\n" + cardNumber + "\n" + cardUser + "\n" + cardExpiryDate);
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardUser() {
        return cardUser;
    }

    public void setCardUser(String cardUser) {
        this.cardUser = cardUser;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public static void main(String[] args) {
        BusinessCard bc = new BusinessCard();
        StandardCard sc = new StandardCard();
        GoldCard gc = new GoldCard();
        bc.setCardType("BUSINESS CARD");
        sc.setCardType("STANDARD CARD");
        gc.setCardType("GOLD CARD");
//        bc.onlineShopping();
//        sc.onlineShopping();
//        gc.onlineShopping();
        bc.setCardNumber(433555120001l);
        gc.setCardNumber(101100005522l);
        bc.setCardUser("VARDANUSH SAHAKYAN");
        gc.setCardUser("VARD SEDRAKYAN");
        bc.setCardExpiryDate("01/2028");
        gc.setCardUser("01/2030");
        sc.cardSHows();
        bc.cardSHows();
        gc.cardSHows();

    }
}



