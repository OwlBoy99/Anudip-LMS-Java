package program;

abstract class BankAccount {
    private String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            super.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= super.balance) {
            super.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
}
public class AbsIntAssign2 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("123456", 1000.0);

        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + checkingAccount.getBalance());

        checkingAccount.deposit(500.0);
        System.out.println("Current Balance: $" + checkingAccount.getBalance());

        checkingAccount.withdraw(200.0);
        System.out.println("Current Balance: $" + checkingAccount.getBalance());

        checkingAccount.withdraw(1500.0); // Attempt to withdraw more than the balance
        System.out.println("Current Balance: $" + checkingAccount.getBalance());
    }
}

