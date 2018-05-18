package bank;

import org.junit.jupiter.api.BeforeEach;

public class BankAccountTest {

    BankAccount bak;
    @BeforeEach
    public void setup() {
        bak = new BankAccount();
        System.out.println("Hello");
    }
}
