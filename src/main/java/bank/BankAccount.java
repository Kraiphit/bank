package bank;

public class BankAccount {
    public double balance;
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
