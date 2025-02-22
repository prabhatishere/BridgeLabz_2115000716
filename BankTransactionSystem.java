import java.util.Scanner;


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


public class BankTransactionSystem {
    private double balance;


    public BankTransactionSystem(double initialBalance) {
        this.balance = initialBalance;
    }


    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance!");
        }


        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }


    public static void print() {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter initial balance: ");
            double initialBalance = Double.parseDouble(scanner.nextLine());


            BankTransactionSystem account = new BankTransactionSystem(initialBalance);


            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(scanner.nextLine());


            account.withdraw(amount);
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }


    public static void main(String[] args) {
        print();
    }
}


