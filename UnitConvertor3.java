// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
// public static double convertFarhenheitToCelsius(double farhenheit) => 
// Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
// Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
// Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
// Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
// Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
// Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 


import java.util.Scanner;    

public class UnitConvertor3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Convert Fahrenheit to Celsius
        System.out.println("Enter Fahrenheit to convert to Celsius:");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");

        // Convert Celsius to Fahrenheit
        System.out.println("Enter Celsius to convert to Fahrenheit:");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");

        // Convert pounds to kilograms
        System.out.println("Enter pounds to convert to kilograms:");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");

        // Convert kilograms to pounds
        System.out.println("Enter kilograms to convert to pounds:");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Convert gallons to liters
        System.out.println("Enter gallons to convert to liters:");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        // Convert liters to gallons
        System.out.println("Enter liters to convert to gallons:");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");

        sc.close();
    }
}
