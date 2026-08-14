package bankTransferSystem;

public class BankAccountt {
    private String accountNumber;
    private double balance;

    public BankAccountt(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
        if (amount > balance){
            throw new InsufficientBalanceException("Insufficent balance");
        }
        balance -= amount;
        System.out.println("Withdraw successful");


    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new InvalidAmountException("Invalid amount");
        }
        balance += amount;

    }
    public double getBalance(){
        return getBalance() ;
    }

}
