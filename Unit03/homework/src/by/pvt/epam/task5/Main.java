package by.pvt.epam.task5;

/* Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
        метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
        и методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
        Найти и вывести:  a) список покупателей в алфавитном порядке;  b) список покупателей, у которых номер
        кредитной карточки находится в заданном интервале*/

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Shop shop = new Shop();
        main.fillRepoWithCustomers(shop);

        CustomerListService customerService = new CustomerListService();

        main.printAllCustomers(shop);

        customerService.sortCustomersInABC(shop);
        main.printAllCustomers(shop);

        customerService.sortCustomersWithValidCCN(shop, 4000_0000_0000_0000L, 6000_0000_0000_0000L);
        main.printAllCustomers(shop);
    }

    private void printAllCustomers(Shop shop) {
        shop.getCustomerList().forEach(System.out::println);
    }

    private void fillRepoWithCustomers(Shop customers) {
        customers.addCustomer(new Customer(1,
                "Protosevich", "Antony", "Stanislavovich",
                "Minsk", 4276_7423_2435_9742L, "BSA746854"));

        customers.addCustomer(new Customer(2,
                "Mary", "Jane", "Igorevna",
                "London", 4423_1784_2486_1234L, "BSA247854"));

        customers.addCustomer(new Customer(3,
                "Parker", "Peter", "Egorov",
                "Moscow", 1278_3422_5465_9442L, "BSA712354"));

        customers.addCustomer(new Customer(4,
                "Ivanchik", "Ivan", "Ivanov",
                "Brasil", 4741_7229_2435_9742L, "GTE842631"));

        customers.addCustomer(new Customer(5,
                "Rivia", "Gelart", "Vesemirovich",
                "Warsaw", 1423_7425_3575_475L, "NVG742325"));
    }
}
