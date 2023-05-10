package financialSystem;

public class GoldCard extends BankCard {
    public double fixedAccount(double lunchFixe) {
        lunchFixe = 100000;
        return lunchFixe;
    }

    public int cashoutBonus(int bonus, int cashout){
        if (cashout==1) {
            bonus+=2;
        }
        return bonus;
    }
}
