// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the 
// following.  Please define static methods for all the UnitConvertor class methods. E.g. 
// public static double convertKmToMiles(double km) => 
// Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
// Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
// Method to convert meters to feet and return the value. Use the following code to convert  double 
// meters2feet = 3.28084;
// Method to convert feet to meters and return the value. Use the following code to convert  double 
// feet2meters = 0.3048;

import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371*km;
        return km2miles;
    }
    public static double convertMilesToKm(double miles){
        double miles2Km = 1.60934*miles;
        return miles2Km;
    }
    public static double convertMetersToFeet(double meters){
        double metres2Feet = 3.28084 * meters;
        return metres2Feet;
    }
    public static double convertFeetToMeters(double feet){
        double feet2Meters = 0.3048 * feet;
        return feet2Meters;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distanace in km");
        double km = sc.nextDouble();
        System.out.println("Enter the distance in meters");
        double meters = sc.nextDouble();
        System.out.println("The distance in km is: "+km);
        double kmToMiles = convertKmToMiles(km);
        System.out.println("The distance in Miles is: "+kmToMiles);
        double milesToKm = convertKmToMiles(kmToMiles);
        System.out.println("The distance in km again is: "+milesToKm);
        double metersToFeet = convertMetersToFeet(meters);
        System.out.println("The distance in meters is: "+meters);
        System.out.println("The distance in feet is: "+metersToFeet);
        double feetToMeters = convertFeetToMeters(metersToFeet);
        System.out.println("The distance in meters again is: "+feetToMeters);
        sc.close();

    }
}
