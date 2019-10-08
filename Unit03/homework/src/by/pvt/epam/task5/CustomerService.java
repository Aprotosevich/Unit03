package by.pvt.epam.task5;

import java.util.Comparator;
import java.util.List;

public class CustomerService {

    private List<Customer> customerList;

    public void printAllCustomers() {
        customerList.forEach(System.out::println);
    }

    public void printCustomersInABC() {
        customerList.sort(Comparator.comparing(Customer::getSecondName)
                .thenComparing(Comparator.comparing(Customer::getFirstName))
                .thenComparing(Comparator.comparing(Customer::getThirdName)));
        customerList.forEach(System.out::println);
    }

    public void printCustomersWithValidCCN(long fromNumber, long tillNumber) {
        customerList.stream()
                .filter(n -> n.getCreditCardNumber() >= fromNumber && n.getCreditCardNumber() <= tillNumber)
                .forEach(System.out::println);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
