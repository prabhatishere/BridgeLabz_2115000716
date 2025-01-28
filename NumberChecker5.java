// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// Hint => 
// Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
// Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
// Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
// Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
// Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7


public class NumberChecker5 {
    public static void main(String[] args) {
        int number = 7;
        if (isPrime(number)) {
            System.out.println("It's a Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        if (isNeonNumber(number)) {
            System.out.println("It's a Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
        if (isSpyNumber(number)) {
            System.out.println("It's a Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
        if (isAutomorphicNumber(number)) {
            System.out.println("It's an Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
        if (isBuzzNumber(number)) {
            System.out.println("It's a Buzz Number");
        } else {
            System.out.println("Not a Buzz Number");
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int lastDigit = number % 10;
        return square % 10 == lastDigit;
    }
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}
