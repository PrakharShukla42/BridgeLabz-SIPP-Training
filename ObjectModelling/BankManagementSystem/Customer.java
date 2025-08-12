package ObjectModelling.BankManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void viewBalance(Account account) {
        System.out.println("Balance: " + account.getBalance());
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
