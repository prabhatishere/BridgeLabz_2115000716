import java.util.Scanner;
class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int distanceInFeet = sc.nextInt();
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        sc.close();
    }
}
