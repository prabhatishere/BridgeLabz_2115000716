// Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
// Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
// Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format

import java.util.*;
public class ZaraBonus {
    public static void main(String[] args) {
        int[][] employeeData = new int[10][3];
        for (int i = 0; i < 10; i++) {
            employeeData[i] = determineSalaryAndYears();
        }
        int[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displaySummary(updatedData);
    }
    public static int[] determineSalaryAndYears() {
        Random rand = new Random();
        int salary = rand.nextInt(90000) + 10000;
        int yearsOfService = rand.nextInt(10) + 1; 
        return new int[]{salary, yearsOfService};
    }
    public static int[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int[][] updatedData = new int[10][3];
        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            int bonusPercentage = (yearsOfService > 5) ? 5 : 2;
            int bonusAmount = (oldSalary * bonusPercentage) / 100;
            int newSalary = oldSalary + bonusAmount;
            updatedData[i] = new int[]{oldSalary, bonusAmount, newSalary};
        }
        return updatedData;
    }

    public static void displaySummary(int[][] updatedData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;     System.out.println("--------------------------------------------------");
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][2];
            totalBonus += updatedData[i][1];
        } System.out.println("--------------------------------------------------");
        System.out.println("Total\t" + totalOldSalary + "\t\t" + totalBonus + "\t\t" + totalNewSalary);
        System.out.println("--------------------------------------------------");
    }
}
