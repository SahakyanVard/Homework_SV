package probation_1;

public class Method_1 {
    public static void main(String[] args) {

        Method_2 card1 = new Method_2();

        card1.cardUser = "VARD SAHAKYAN";
        card1.cardCode = 956;
        card1.date = "03/28";

        Method_2 card2 = new Method_2();
        card2.cardUser = "SAM SEDRAKYAN";
        card2.cardNumber = 4355053924153878l;
        card2.cardCode = 936;
        card2.date = "02/28";
        card1.setCardNumber(12345678912378911l);
    }
}