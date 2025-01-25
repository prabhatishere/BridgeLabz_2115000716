// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. 
// For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take input for a number of persons
// Create arrays to store the weight, height, BMI, and weight status of the persons
// Take input for the weight and height of the persons
// Calculate the BMI of all the persons and store them in an array and also find the weight status
//  of the persons
// Display the height, weight, BMI, and weight status of each person
// Use the table to determine the weight status of the person

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Arrays to store height, weight, BMI, and status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Input: Heights and weights for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Enter weight (in kilograms): ");
            weights[i] = scanner.nextDouble();

            // Calculate BMI
            bmis[i] = calculateBMI(weights[i], heights[i]);

            // Determine weight status
            statuses[i] = getWeightStatus(bmis[i]);
        }

        // Output: Display height, weight, BMI, and status
        System.out.println("\nBMI Details:");
        System.out.println("Height (m)    | Weight (kg) | BMI          | Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(heights[i] + "        | " + weights[i] + "         | " + bmis[i] + " | " + statuses[i]);
        }
        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to determine weight status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
