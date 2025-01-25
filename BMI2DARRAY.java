import java.util.Scanner;

public class BMI2DARRAY  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");

            do {
                System.out.print("Enter height (in meters, positive value): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight (in kilograms, positive value): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);

            personData[i][2] = calculateBMI(personData[i][1], personData[i][0]);

            weightStatus[i] = getWeightStatus(personData[i][2]);
        }

        System.out.println("\nBMI Details:");
        System.out.println("Height (m) | Weight (kg) | BMI       | Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][0] + "        | " + personData[i][1] + "         | " + personData[i][2] + " | " + weightStatus[i]);
        }

        sc.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
