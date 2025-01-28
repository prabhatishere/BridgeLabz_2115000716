// Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

// Hint => 
// Write a Method to get the name of the month. For this define a month Array to store the names of the months
// Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
// Write a method to get the first day of the month using the Gregorian calendar algorithm
// y0 = y − (14 − m) / 12
// x = y0 + y0/4 − y0/100 + y0/400
// m0 = m + 12 × ((14 − m) / 12) − 2
// d0 = (d + x + 31m0 / 12) mod 7
// Displaying the Calendar requires 2 for loops. 
// The first for loop up to the first day to get the proper indentation. As in the 
// example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
// The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat

import java.util.*;
public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(year, month);
        System.out.println("  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month - 1];
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
    public static int dayOfWeek(int d) {
        return d % 7;
    }
}
