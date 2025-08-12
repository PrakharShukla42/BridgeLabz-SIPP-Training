package ObjectModelling.BankManagementSystem;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank of India");
        Customer customer1 = new Customer("Prakhar");

        Account account1 = bank1.openAccount(customer1, 5000);
        customer1.addAccount(account1);

        customer1.viewBalance(account1);
        bank1.getBankDetails();

        account1.printAccountDetails();
    }
}
