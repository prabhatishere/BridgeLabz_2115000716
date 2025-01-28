    // Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for number of students
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Write a method to use the combination formulae to calculate the number of handshakes

import java.util.Scanner;

public class Handshakes2 {
    public static int calculateHandshakes(int n){
        int maximumHandshakes = (n * (n-1)) /2;
        return maximumHandshakes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int totalStudents = sc.nextInt();
        int handshakes = calculateHandshakes(totalStudents);
        System.out.println("Maximum number of possible handshakes for "+totalStudents+" students is: "+handshakes);
        sc.close();

    }
}

