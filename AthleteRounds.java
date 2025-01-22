// Rewrite the Sample Program 2 with user inputs
// Hint => 
// Create variables and take user inputs for name, fromCity, viaCity, toCity
// Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
// Create Variables and take time taken 
// Finally, print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
// O/P => The results of Int Operations are ___, ___, and ___

import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1 of the triangular park: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 of the triangular park: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 of the triangular park: ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
        sc.close();
    }
}
