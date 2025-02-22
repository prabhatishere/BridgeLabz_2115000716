import java.util.Scanner;


class Test4 {
    public static void print() {
        handleArrayOperations();
    }


    private static void handleArrayOperations() {
        Scanner scanner = new Scanner(System.in);


        try {
            int[] numbers = { 10, 20, 30, 40, 50 };
            System.out.print("Enter an index: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Test4.print();
    }
}
