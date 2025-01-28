// Write a program to find the sum of n natural numbers using recursive method and 
// compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number, if not exit
// Write a Method to find the sum of n natural numbers using recursion
// Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
// Compare the two results and print the result

import java.util.Scanner;

public class SumRecursion {
    // Recursive method to find the sum
    public static int calculateSum(int n, int sum){
        if(n==0){
            return sum;
        }
        return calculateSum(n-1, sum+n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int number = sc.nextInt();
        if(number<1){ //number!= Math.floor(number)--> not required as input is in integer
            System.exit(0);
        }
        int sum = 0;
        int sumUsingRecursion = calculateSum(number,sum);
        System.out.println(sumUsingRecursion);
        int sumUsingFormulae = (number*(number+1))/2;
        System.out.println("The sum using recursion: "+sumUsingRecursion);
        System.out.println("The sum using formulae: "+sumUsingFormulae);
        sc.close();
    }
}
