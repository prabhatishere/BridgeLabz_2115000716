package Practice_Problem_1;

import java.util.Scanner;

public class kmsToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The distance in miles is: "+ miles);
    }
}
