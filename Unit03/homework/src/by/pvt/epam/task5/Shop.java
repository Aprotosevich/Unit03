package by.pvt.epam.task5;

import java.util.*;

public class Shop {

    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    // ... other Shop data,methods etc.

}
