// Write a program to take user input for 5 numbers and check whether a number is positive,  
// negative, or zero. Further for positive numbers check if the number is even or odd. Finally 
// compare the first and last elements of the array and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd 
// numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the number "+(i+1));
            numbers[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<5;i++){
            if(numbers[i]>0){
                if(numbers[i]%2==0){
                    System.out.println("The number is: EVEN");
                }else System.out.println("The number is: ODD");
            }
            else if(numbers[i]<0) System.out.println("The number is NEGATIVE");
            else System.out.println("The number is ZERO");
        }
        if(numbers[0] == numbers[numbers.length-1]) System.out.println("First and Last elements of the array are EQUAL");
        else if(numbers[0] > numbers[numbers.length-1]) System.out.println("First element of the array is GREATER than Last element");
        else System.out.println("First element of the array is SMALLER than Last element");
    }
}
