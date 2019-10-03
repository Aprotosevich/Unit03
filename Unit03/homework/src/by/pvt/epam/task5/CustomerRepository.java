package by.pvt.epam.task5;

import java.util.*;

public class CustomerRepository {

    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

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

}
