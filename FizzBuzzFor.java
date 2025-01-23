import java.util.Scanner;
public class FizzBuzzFor {
    public static void fizzBuzzForLoop(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num > 0) {
            fizzBuzzForLoop(num);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}