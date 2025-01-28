// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// Hint => 
// Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
// Method to find the greates factor of a Number using the factors array
// Method to find the sum of the factors using factors array and return the sum
// Method to find the product of the factors using factors array and return the product
// Method to find product of cube of the factors using the factors array. Use Math.pow() 
// Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
// Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
// Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
// Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself



import java.util.Arrays;
public class NumberChecker6 {
    public static void main(String[] args) {
        int number = 28;
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);
        int productOfCubes = findProductOfCubes(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);
        if (isPerfectNumber(number, sumOfFactors)) {
            System.out.println("It's a Perfect Number");
        }
        if (isAbundantNumber(number, sumOfFactors)) {
            System.out.println("It's an Abundant Number");
        }
        if (isDeficientNumber(number, sumOfFactors)) {
            System.out.println("It's a Deficient Number");
        }
        if (isStrongNumber(number)) {
            System.out.println("It's a Strong Number");
        }
    }
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[factors.length - 1];
        return greatest;
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static int findProductOfCubes(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number, int sumOfFactors) {
        return sumOfFactors - number == number;
    }
    public static boolean isAbundantNumber(int number, int sumOfFactors) {
        return sumOfFactors - number > number;
    }
    public static boolean isDeficientNumber(int number, int sumOfFactors) {
        return sumOfFactors - number < number;
    }
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
