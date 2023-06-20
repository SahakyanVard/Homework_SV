package memoryModel;

import java.util.Objects;

public class BankCard {
    private String name;
    private String cardNumber;
    private int cvv;

    public BankCard(String name, String cardNumber, int cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BankCard bankCard = (BankCard) o;
        return cvv == bankCard.cvv && Objects.equals(name, bankCard.name) && Objects.equals(cardNumber, bankCard.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cardNumber, cvv);
    }
}
