import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
        System.out.println("The addition is " + (number1 + number2) + ", subtraction is " + (number1 - number2) + ", multiplication is " + (number1 * number2) + ", and division is " + (number1 / number2));
        sc.close();
    }
}
