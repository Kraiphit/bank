package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankDataServiceTest {
    private Bank bank;
    @BeforeEach
    public void setup(){
        bank = new Bank("MyBank", new DataServiceStub());
        bank.addAllCustomers();
    }
    @Test
    void testFindCustomerById(){
        Customer cust = bank.findCustomerById(1);
        assertEquals("MrX", cust.getName());
    }

    private class DataServiceStub implements IDataService<Customer>{
        @Override
        public Iterator<Customer> getAllObject(){
            ArrayList<Customer> list = new ArrayList<>();
            list.add(new Customer(1, 123, "MrX"));
            list.add((new Customer(2, 456, "MsY")));
            return list.iterator();
        }

        @Override
        public Iterator<Customer> getAllObjects() {
            ArrayList<Customer> list = new ArrayList<>();
            list.add(new Customer(1, 123, "MrX"));
            list.add((new Customer(2, 456, "MsY")));
            return list.iterator();
        }
    }
}
