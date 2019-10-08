package by.pvt.epam.task5;

/* Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. */

import java.util.Objects;

public class Customer {

    private int id;
    private String secondName;
    private String firstName;
    private String thirdName;
    private String address;

    private long creditCardNumber;
    private String bankAccountNumber;

    public Customer() {

    }

    public Customer(int id, String secondName, String firstName, String thirdName,
                    String address, long creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.thirdName = thirdName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer: " + secondName + ' ' + firstName + ' ' + thirdName +
                ", address: " + address +
                ", creditCardNumber: " + creditCardNumber + ", bancAccountNumber: " + bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                creditCardNumber == customer.creditCardNumber &&
                Objects.equals(secondName, customer.secondName) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(thirdName, customer.thirdName) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secondName, firstName, thirdName, address, creditCardNumber, bankAccountNumber);
    }
}
