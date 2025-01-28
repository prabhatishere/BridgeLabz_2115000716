// Write a program that takes a year as input and outputs the Year is a Leap Year or not 
// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
// Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
// Write a method to check for Leap Year using the conditions a and b

import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year:");
        int year = sc.nextInt();
        boolean leapYear = checkLeapYear(year);
        System.out.println("Is the entered year a Leap Year? "+leapYear);
        sc.close();
    }
}
