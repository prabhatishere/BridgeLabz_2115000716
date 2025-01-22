//Write a program to take 2 numbers and print their quotient and reminder
//Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//I/P => number1, number2
//O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
    


import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        // Take input of first number
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        // Take input of second number
        int number2 = sc.nextInt();
        // Calculate quotient
        int quotient = number1 / number2;
        // Calculate remainder
        int remainder = number1 % number2;
        System.out.println("The Quotient is "+quotient+ " and Remainder is "+ remainder+" of two numbers "+number1+" and "+number2);
        sc.close();

    }
}
