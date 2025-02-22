import java.util.Scanner;


class Test2 {
    public static void print() {
        handleDivision();
    }


    private static void handleDivision() {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());


            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());


            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }


            double result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


public class UncheckedException{
    public static void main(String[] args) {
        Test2.print();
    }
}


