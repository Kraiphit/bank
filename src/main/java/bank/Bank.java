package bank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bank {
    public String bankName;

    public Map<Integer, Customer> customers;
    public IDataService dataService;

    public Bank(String name) {
        this(name, new CustomerFileDataService());
    }

    protected Bank(String name, IDataService dataService){
        this.bankName = name;
        this.customers = new HashMap<>();
        this.dataService = dataService;
    }
    public void addCustomer(Customer c){
        customers.put(c.getId(), c);
    }
    public Customer findCustomerById(int custId){
        return customers.get(custId);
    }
    public final boolean validateCustomer(int custId, int pin){
        Customer customer = findCustomerById(custId);
        if (customer != findCustomerById(custId)){
            return true;
        }
        return false;
    }
    public void addAllCustomers() {
        Iterator<Customer> itr = dataService.getAllObjects();
        while (itr.hasNext()) {
            addCustomer(itr.next());
        }
    }
}
