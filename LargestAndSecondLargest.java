// Create a program to store the digits of the number in an array and find the largest and
//  second largest element of the array.
// Hint => 
// Create a number variable and Take user input. 
// Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
// Create an integer variable index with the value 0 to reflect the array index.
// Use a loop to iterate until the number is not equal to 0.
// Remove the last digit from the number in each iteration and add it to the array.
// Increment the index by 1 in each iteration and if the index count equals maxDigit then 
// break out of the loop and the remaining digits are not added to the array
// Define variable to store largest and second largest digit and initialize it to zero
// Loop through the array and use conditional statements to find the largest and second
//  largest number in the array
// Finally display the largest  and second-largest number

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        // Take input for number
        int number = sc.nextInt();
        
        // Calculate the digits in the number to find the size of the array 
        int temp = number;
        int maxDigit = 0;
        while(temp!=0){
            maxDigit++;
            temp/=10;
        }
        // Array to store the digits
        int digits[] = new int [maxDigit];
        int i =0;
        while(number!=0){
            if(i == maxDigit) break;
            int digit = number%10;
            digits[i] = digit;
            number = number / 10;
            i++;
        }
        sc.close();
        int Largest = 0;
        int secondLargest = 0;
        for(i=0;i<maxDigit;i++){
            if(digits[i]>Largest){
                secondLargest = Largest;
                Largest = digits[i];
            }
            else if(digits[i]>secondLargest && digits[i]<Largest){
                secondLargest = digits[i];
            }
            
        }
        System.out.println("The Largest digit in the number is: "+Largest+"\nThe Second Largest digit in the number is: "+secondLargest);
        
    }
}
