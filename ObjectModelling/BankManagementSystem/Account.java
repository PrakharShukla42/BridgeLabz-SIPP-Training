package ObjectModelling.BankManagementSystem;

public class Account {
    private Customer customer;
    private double balance;
    private Bank bank;

    public Account(Customer customer, double balance, Bank bank) {
        this.customer = customer;
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // New method that uses bank field
    public void printAccountDetails() {
        System.out.println("Bank: " + bank.getBankName());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Balance: " + balance);
    }
}
