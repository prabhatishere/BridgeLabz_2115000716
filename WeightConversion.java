// Create a program to convert weight in pounds to kilograms.
// Hint => 1 pound = 2.2 kg
// I/P => weight
// O/P => The weight of the person in pound is ___ and in kg is ___

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);
        sc.close(); 
    }
}