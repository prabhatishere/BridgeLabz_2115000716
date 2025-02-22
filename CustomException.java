import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


class Test3 {
    public static void print() {
        handleAgeValidation();
    }


    private static void handleAgeValidation() {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            validateAge(age);
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}


public class CustomException {
    public static void main(String[] args) {
        Test3.print();
    }
}
