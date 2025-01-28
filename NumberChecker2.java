// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// Hint => 
// Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// Method to find the sum of the digits of a number using the digits array
// Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
// Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
// Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.


import java.util.*;
public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 153;
        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);
        int[] digits = storeDigits(number, digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumOfDigits);
        int sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        if (isHarshadNumber(number, sumOfDigits)) {
            System.out.println("It's a Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        int[][] digitFrequencies = findDigitFrequencies(digits);
        for (int[] frequency : digitFrequencies) {
            System.out.println("Digit: " + frequency[0] + ", Frequency: " + frequency[1]);
        }
    }
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number, int digitCount) {
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }
    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2]; // 0-9 digits
        for (int digit : digits) {
            frequencies[digit][0] = digit;
            frequencies[digit][1]++;
        }
        return frequencies;
    }
}
