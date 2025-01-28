// Write a program to check whether a number is positive, negative, or zero.
// Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 
// for positive number and 0 if number is zero

import java.util.Scanner;

public class SignCheck {
    public static int checkSign(int n){
        if(n<0) return -1;
        else if(n>0) return 1;
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkSign(number);
        System.out.println("Result for your entered number is: "+result);
        sc.close();
    }    
}
