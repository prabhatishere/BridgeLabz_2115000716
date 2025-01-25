// Create a program to take a number as input and reverse the number. 
// To do this, store the digits of the number in an array and display the array in reverse order
// Hint => 
// Take user input for a number. 
// Find the count of digits in the number. 
// Find the digits in the number and save them in an array
// Create an array to store the elements of the digits array in reverse order

// Finally, display the elements of the array in reverse order  
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    // Take input for number
    int number = sc.nextInt();
    sc.close();
    // Calculate the digits in the number to find the size of the array 
    int temp = number;
    int maxDigit = 0;
    while(temp!=0){
        maxDigit++;
        temp/=10;
    }
    int digits[] = new int [maxDigit];
    int i =0;
    while(number!=0){
        if(i == maxDigit) break;
        int digit = number%10;
        digits[i] = digit;
        number = number / 10;
        i++;
    }
    System.out.println("Number in reverse order");
    for(i=0;i<maxDigit;i++){
        System.out.print(digits[i]);
    }
        
    }
}    
    
    

