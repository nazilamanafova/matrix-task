package patterns;

public enum Currency {
    AZN(1.0), USD(1.70), EUR(2), RUB(0.2);

    private double rate;

    private Currency( ) {
    }
    private Currency(double rate){
        this.rate = rate;
    }
    public double convert(double amount, Currency target){
        return amount * this.rate / target.rate;
    }
}
