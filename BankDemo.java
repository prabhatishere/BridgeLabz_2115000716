import java.util.ArrayList;
import java.util.List;


class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialBalance) {
        customers.add(customer);
        customer.addAccount(new Account(this, initialBalance));
    }

    public String getName() {
        return name;
    }
}


class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println(name + "'s Account Balances:");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }
}


class Account {
    private Bank bank;
    private double balance;

    public Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}


public class BankDemo {
    public static void main(String[] args) {

        Bank bank1 = new Bank("National Bank");      
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        bank1.openAccount(customer1, 1000.00);
        bank1.openAccount(customer2, 2000.00);
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
