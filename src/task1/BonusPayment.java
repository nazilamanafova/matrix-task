package task1;

public record BonusPayment(int id,
                           String customerId,
                           double amount,
                           String bonusType) implements Payment {
}
