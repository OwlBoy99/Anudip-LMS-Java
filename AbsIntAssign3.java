package program;

interface Bankaccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount1 implements Bankaccount {
    private double balance;

    public CheckingAccount1(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AbsIntAssign3 {
    public static void main(String[] args) {
        CheckingAccount1 checkingAccount1 = new CheckingAccount1(1000.0);

        System.out.println("Initial Balance: $" + checkingAccount1.getBalance());

        checkingAccount1.deposit(500.0);
        System.out.println("Current Balance: $" + checkingAccount1.getBalance());

        checkingAccount1.withdraw(200.0);
        System.out.println("Current Balance: $" + checkingAccount1.getBalance());

        checkingAccount1.withdraw(1500.0); // Attempt to withdraw more than the balance
        System.out.println("Current Balance: $" + checkingAccount1.getBalance());
    }
}
