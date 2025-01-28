// Write a program to calculate various trigonometric functions using Math class given an angle in degrees
// Hint => 
// Method to calculate various trigonometric functions, Firstly convert to 
// radians and then use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)

import java.util.*;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);

        sc.close();
    }
}
