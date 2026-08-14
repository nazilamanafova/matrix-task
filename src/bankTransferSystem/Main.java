package bankTransferSystem;

public class Main {
    public static  void main(String[] args){
                bankTransferSystem.BankAccountt bankAccountt = new bankTransferSystem.BankAccountt("A123", 200);
        try {
            bankAccountt.withdraw(100);
        } catch (bankTransferSystem.InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        } catch (bankTransferSystem.InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Transaction log saved");
        }

        try {
            bankAccountt.withdraw(-100);
        } catch (bankTransferSystem.InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        } catch (bankTransferSystem.InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Transaction log saved");
        }

        try {
            bankAccountt.withdraw(1000);
        } catch (bankTransferSystem.InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        } catch (bankTransferSystem.InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Transaction log saved");
        }

        System.out.println("Operation finished.");

    }
}
