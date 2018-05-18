package bank;

public class Customer {
    public int id;
    public int pin;
    public String name;
    public BankAccount account;

    public Customer(int id, int pin, String name){
        this.id = id;
        this.pin = pin;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public final boolean match(int pin){
        return this.pin == pin;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BankAccount getAccount() {
        return account;
    }
}