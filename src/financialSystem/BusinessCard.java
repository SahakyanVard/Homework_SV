package financialSystem;

public class BusinessCard extends BankCard{
    public int getAddSum() {
        return addSum;
    }

    public void setAddSum(int addSum) {
        this.addSum = addSum;
    }
    private int addSum=1000000;

    @Override
    public void onlineShopping() {
        super.onlineShopping();
        System.out.println("\n And we get 10% cashback for online purchases");
    }
}
