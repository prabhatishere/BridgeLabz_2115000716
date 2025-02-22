import java.util.Scanner;


public class NestedTryCatch {
    public static void print() {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter array size: ");
            int size = Integer.parseInt(scanner.nextLine());
            int[] numbers = new int[size];


            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                numbers[i] = Integer.parseInt(scanner.nextLine());
            }


            System.out.print("Enter index to access: ");
            int index = Integer.parseInt(scanner.nextLine());


            System.out.print("Enter divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());


            try {
                int value = numbers[index];


                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }


    public static void main(String[] args) {
        print();
    }
}


