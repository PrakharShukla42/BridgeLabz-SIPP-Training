package ObjectModelling.BankManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double initialBalance) {
        customers.add(customer);
        Account account = new Account(customer, initialBalance, this);
        return account;
    }

    public void getBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Customers:");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }

    public String getBankName() {
        return bankName;
    }
}
