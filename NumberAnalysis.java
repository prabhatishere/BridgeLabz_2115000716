// Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
// Hint => 
// Write a Method to Check whether the number is positive or negative
// Write a Method to check whether the number is even or odd
// Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
// In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
// If the number is negative, print negative. 
// Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
	



import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is Negative");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First element is greater than the last element");
        } else if (comparison == 0) {
            System.out.println("First element is equal to the last element");
        } else {
            System.out.println("First element is less than the last element");
        }

        sc.close();
    }
}
