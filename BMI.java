import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        
        System.out.print("Enter height in cm: ");
        double heightInCm = scanner.nextDouble();

        
        double heightInMeters = heightInCm / 100;

       
        double bmi = weight / (heightInMeters * heightInMeters);

        
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        
        System.out.printf("\nYour BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);
        scanner.close();

    }
}
