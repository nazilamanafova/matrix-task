package task1;

public record CashPayment(int id,
                          String customerId,
                          double amount,
                          String terminalId) implements Payment {
}
