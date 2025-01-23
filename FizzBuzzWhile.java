import java.util.Scanner;
public class FizzBuzzWhile {
    public static void fizzBuzzWhileLoop(int number) {
        int i = 0;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num > 0) {
            fizzBuzzWhileLoop(num);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}



