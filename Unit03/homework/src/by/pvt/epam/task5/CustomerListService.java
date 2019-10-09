package by.pvt.epam.task5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerListService {


    public void sortCustomersInABC(Shop shop) {
        shop.getCustomerList()
                .sort(Comparator.comparing(Customer::getSecondName)
                .thenComparing(Comparator.comparing(Customer::getFirstName))
                .thenComparing(Comparator.comparing(Customer::getThirdName)));
    }

    public void sortCustomersWithValidCCN(Shop shop, long fromNumber, long tillNumber) {
        List<Customer> customerList = shop.getCustomerList()
                .stream()
                .filter(n -> n.getCreditCardNumber() >= fromNumber && n.getCreditCardNumber() <= tillNumber)
                .collect(Collectors.toList());

        shop.setCustomerList(customerList);
    }


}
