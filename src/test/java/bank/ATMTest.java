package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ATMTest {
    @Mock Bank stubBank;
    @Mock Customer stubCustomer1;
    @Mock Customer stubCustomer2;
    @Mock BankAccount mockAccount1;
    @Mock BankAccount mockAccount2;

    private ATM atm;

    @BeforeEach
    public  void initMocks(){
        MockitoAnnotations.initMocks(this);
        atm = new ATM(stubBank);
    }
    @Test
    void testTransfer(){
        int senderId = 1;
        int receiverId = 2;
        int amount = 200;

        when(stubBank.findCustomerById(senderId)).thenReturn(stubCustomer1);
        when(stubCustomer1.getAccount()).thenReturn(mockAccount1);

        when(stubBank.findCustomerById(receiverId)).thenReturn(stubCustomer2);
        when(stubCustomer2.getAccount()).thenReturn(mockAccount2);

        atm.transfer(senderId, receiverId, amount);

        verify(mockAccount1).withdraw(amount);
        verify(mockAccount2).deposit(amount);
    }
}
