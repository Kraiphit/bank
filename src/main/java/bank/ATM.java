package bank;

public class ATM {
    private Bank bank;
    public ATM(Bank bank){
        this.bank = bank;
    }
    public void transfer(int fromCustId, int toCustId, double amount) {
        Customer sendingCustomer = bank.findCustomerById(fromCustId);
        BankAccount sendingAccount = sendingCustomer.getAccount();

        Customer receivingCustomer = bank.findCustomerById(toCustId);
        BankAccount receivingAccount = receivingCustomer.getAccount();

        sendingAccount.withdraw(amount);
        receivingAccount.deposit(amount);
    }
    void deposit(int custId, double value) {
        Customer customer = bank.findCustomerById(custId);
        BankAccount account = customer.getAccount();

        account.deposit(value);
    }

    void withdraw(int custId, double value) {
        Customer customer = bank.findCustomerById(custId);
        BankAccount account = customer.getAccount();

        account.withdraw(value);
    }
}
