package bank;

import java.util.Iterator;

public interface IDataService<T> {
    public Iterator<Customer> getAllObject();

    Iterator<Customer> getAllObjects();
}
