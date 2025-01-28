// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
// Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            statuses[i] = determineStatus(data[i][2]);
        }

        System.out.println("\nDetails of Team Members:");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + statuses[i]);
        }

        sc.close();
    }
}
