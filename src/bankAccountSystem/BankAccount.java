package bankAccountSystem;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    final String bankCode = "KB001";

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            System.out.println("Owner name cannot be empty");
            return;
        }
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void showAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    private void calculateInternalFee() {
        System.out.println("Internal fee calculated");
    }

    protected void printBankPolicy() {
        System.out.println("Transactions must be valid.");
    }


}
//main
//        BankAccountSystem.BankAccount account = new BankAccountSystem.BankAccount("ACC1001",
//                "Ali", 1200);
//        account.deposit(300);
//        account.withdraw(100);
//        account.showAccountInfo();
//
//        //account.bankCode = "KB002";
