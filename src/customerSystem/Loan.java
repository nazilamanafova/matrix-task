package customerSystem;

public class Loan extends BankProduct {
    String loonId;
    double debt;

    public Loan(String number, String loonId, double price){
        super(price);
        this.loonId = loonId;
    }

    @Override
    public double calculateIncome() {
        return price - debt;
    }
}
