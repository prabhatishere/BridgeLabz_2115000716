// Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
// Hint => 
// Take a, b, and c as input values to find the roots of x.
// The roots are computed using the following formulae
// delta = b2+ 4*a*c
// If delta is positive the find the two roots using formulae 
// root1 of x = (-b + delta)/(2*a) 
// root1 of x = (-b - delta)/(2*a)
// If delta is zero then there is only one root of x  
// root of x = -b/(2*a)
// If delta is negative return empty array or nothing 
// Write a Method to find find the roots of a quadratic equation and return the roots

import java.util.Scanner;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; // No real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficient a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the coefficient b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the coefficient c: ");
        double c = sc.nextDouble();

        sc.close();
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            return;
        }

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

    }
}

