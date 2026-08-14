package customerSystem;

public class Card extends BankProduct {
    String pan;
    int expireMonth;
    double balance;

    public Card(double price, String pan, int expireMonth, double balance) {
        super(price);
        this.pan = pan;
        this.expireMonth = expireMonth;
        this.balance = balance;
    }

    @Override
    public double calculateIncome() {
        return price + (balance * expireMonth * 0.01);
    }
}