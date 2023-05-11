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
        int count = 0;
        for (int i = 0; i < cardUser.length(); i++) {
            if (Character.isUpperCase(cardUser.charAt(i))) {
                count++;
            }
        }
        if (count == cardUser.length() - 1) {
        } else
            System.out.println("Invalid input data." + "\n All letters of carduser must be uppercase");
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
        if (cardNumber > 0 && cardNumber <= 9999999999999999l) {
        } else System.out.println("The card number is not correct");
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
        this.cardExpiryDate = String.valueOf(cardExpiryDate);
    }

    // BankCard system test.
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
        bc.setCardNumber(4355121512127898l);
//        gc.setCardNumber(1010111122121313l);
        bc.setCardUser("ARAM ARAMYAN");
//        gc.setCardUser("VARD SEDRAKYAN");
        bc.setCardExpiryDate("01/2028");
        gc.setCardExpiryDate("05/2030");
//      gc.cardSHows();
        bc.cardSHows();
        sc.cardSHows();
    }
}



