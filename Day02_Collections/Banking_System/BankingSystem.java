package Day02_Collections.Banking_System;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("ACC101", new BankAccount("ACC101", "Rahul", 5000));
        accounts.put("ACC102", new BankAccount("ACC102", "Priya", 10000));
        accounts.put("ACC103", new BankAccount("ACC103", "Arjun", 7500));

        accounts.values().forEach(System.out::println);

        TreeMap<Double, String> balanceMap = new TreeMap<>();
        for (BankAccount acc : accounts.values()) {
            balanceMap.put(acc.balance, acc.accountHolder);
        }
        balanceMap.forEach((bal, name) -> System.out.println(name + " | Balance: " + bal));

        Queue<String> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add("ACC101");
        withdrawalQueue.add("ACC103");
        withdrawalQueue.add("ACC102");

        while (!withdrawalQueue.isEmpty()) {
            String accNum = withdrawalQueue.remove();
            BankAccount acc = accounts.get(accNum);
            double withdrawalAmount = 1000;
            if (acc.balance >= withdrawalAmount) {
                acc.balance -= withdrawalAmount;
                System.out.println("Withdrawal of " + withdrawalAmount + " successful for " + acc.accountHolder
                        + ". New Balance: " + acc.balance);
            } else {
                System.out.println("Insufficient balance for " + acc.accountHolder);
            }
        }

        accounts.values().forEach(System.out::println);
    }
}