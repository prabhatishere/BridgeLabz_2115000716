import java.util.Scanner;


class Test6 {
    public static void print() {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(scanner.nextLine());


            System.out.print("Enter rate: ");
            double rate = Double.parseDouble(scanner.nextLine());


            System.out.print("Enter years: ");
            int years = Integer.parseInt(scanner.nextLine());


            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }


    public static double calculateInterest(double amount, double rate, int years) {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }
}


public class ThrowVsThrows {
    public static void main(String[] args) {
        Test6.print();
    }
}


