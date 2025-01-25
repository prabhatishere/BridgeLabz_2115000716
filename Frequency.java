// Create a program to take a number as input find the frequency of each digit 
// in the number using an array and display the frequency of each digit

// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array 
// of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;

public class Frequency {
    public static int countDigits(int temp){
        int maxDigit = 0;
        while(temp!=0){
            maxDigit++;
            temp/=10;
        }
        return maxDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count = countDigits(number);
        int digits[] = new int [count];
        int i =0;
        while(number!=0){
            if(i == count) break;
            int digit = number%10;
            digits[i] = digit;
            number = number / 10;
            i++;
        }
        sc.close();
        int frequency[] = new int[10];
        for(i=0;i<count;i++){
            frequency[digits[i]]++; 
        }
        for(i=0;i<frequency.length;i++){
            System.out.println("The frequency of: "+i+" is "+frequency[i]);
        }

    }
}
