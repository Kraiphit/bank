package bank;

import org.junit.jupiter.api.BeforeEach;

public class BankTest {
    Bank bank;
    Customer cust;

    @BeforeEach
    public void setup() {
        bank = new Bank("MyBank");
        cust = new Customer(1, 123, "MrX");
        bank.addCustomer(cust);
    }
}
