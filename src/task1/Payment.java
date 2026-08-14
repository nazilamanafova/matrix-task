package task1;

public sealed interface Payment permits CashPayment, CardPayment, BonusPayment {
    int id();
    String customerId();
    double amount();

}
