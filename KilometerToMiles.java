import java.util.Scanner;
class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km =sc.nextDouble(); // Create a variable km with data type double and Take user input for km
        double miles = km / 1.6; // create a variable miles and store the value of distance changed in miles from kms
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km"); // Display the result
        sc.close();
    }
}
