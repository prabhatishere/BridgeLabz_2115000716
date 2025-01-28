// An athlete runs in a triangular park with sides provided as input by the user in meters. 
// If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => 
// Take user input for 3 sides of a triangle 
// The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// Write a Method to compute the number of rounds user needs to do to complete 5km run

import java.util.Scanner;

public class TriangularPark {
    // a,b, and c are the three sides of the triangular
    public static double calculateRounds(int a, int b, int c, int distance){
        int perimeter = a + b + c;
        // distance changed to meters from km
        double rounds =  ((double) distance * 1000) / perimeter;
        return rounds;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a Triangle in meters:::");
        System.out.println("Enter the value of side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of side 3");
        int side3 = sc.nextInt();
        int distance = 5;
        double rounds = calculateRounds(side1, side2, side3, distance);
        System.out.println("Number of rounds required to complete the 5km run of a Triangular park with the sides\n "+side1+","+side2+","+side3+" is: "+rounds);
        sc.close();
    }
    
}
