package customerSystem;

public class BankProduct {
    double price;

    public BankProduct(double price){
        this.price = price;
    }

    public double calculateIncome() {
        return price;
    }
}
