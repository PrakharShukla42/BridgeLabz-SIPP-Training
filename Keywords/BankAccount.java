package Keywords;

class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;
    String accountHolderName;
    final String accountNumber;
    double balance;
    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Prakhar", "ACC123", 5000);
        acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
