// Create a program to find the factors of a number taken as user input, store the 
// factors in an array and display the factors. Also find the sum, sum of square of factors and 
// product of the factors and display the results
// Hint =>
// Take the input for a number
// Write a static Method to find the factors of the number and save them in an array and return the array. 
// To find factors and save to array will have two loops. The first loop to find the 
// count and initialize the array with the count. And the second loop save the factors into the array
// Write a method to find the sum of the factors using factors array
// Write a method to find the product of the factors using factors array
// Write a method to find the sum of square of the factors using Math.pow() method

import java.util.Scanner;

public class Factors {
    // Method to find the factors and store in array
    public static int[] findFactors(int number){
        int totalFactors = 0;
        for(int i=1;i<=number;i++){
            if(number%i==0) totalFactors++;
        }
        int factors[] = new int[totalFactors];
        int j = 0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[j] = i;
                j++; 
            }
        }
        return factors;
        
    }
    // Method to find the sum of the factors
    public static int findSumOfFacotrs(int factors[]){
        int sum = 0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    // Method to find the product of the factors
    public static double findProductOfFactors(int factors[]){
        double product = 1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }
    // Method to find the sum of square of product of factors
    public static double findSumOfSquareOfFactors(int factors[]){
        double sumOfSquareOfFactors = 0;
        for(int i=0;i<factors.length;i++){
            double square = Math.pow(factors[i],2);
            sumOfSquareOfFactors+=square;
        }
        return sumOfSquareOfFactors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int factors[] = findFactors(number);
        int sumOfFactors = findSumOfFacotrs(factors);
        double productOfFactors = findProductOfFactors(factors);
        double sumOfSquareOfFactors = findSumOfSquareOfFactors(factors);
        System.out.print("Factors of "+number+" are: "+factors[0]);
        for(int i=1;i<factors.length;i++){
            System.out.print(","+factors[i]);
        }
        System.out.println("\nThe sum of the factors is: "+sumOfFactors);
        System.out.println("The product of the factors is: "+productOfFactors);
        System.out.println("The sum of square of the factors is: "+sumOfSquareOfFactors);
        sc.close();
    }
}
