package task1;

public record CardPayment(int id,
                          String customerId,
                          double amount,
                          String bankName) implements Payment {
}
