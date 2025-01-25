// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based
//  on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for age and height for the 3 friends and store it in
//  two arrays each to store the values for age and height of the 3 friends
// Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// Finally display the youngest and tallest of the 3 friends

import java.util.*;
public class YoungestTallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = new int[3];
        int age[] = new int[3];
        System.out.println("\nThree friends are Amar (1st friend), Akbar (2nd friend), and Anthony (3rd friend) respectiviely");
        for(int i=0;i<3;i++){
            System.out.println("Enter Integer values");
            System.out.println("\nEnter the height in cm for friend "+(i+1));
            height[i] = sc.nextInt();
            System.out.println("\nEnter the age in years for friend "+(i+1));
            age[i] = sc.nextInt();
        }
        System.out.println("---Input Complete---");
        int youngest = Integer.MAX_VALUE;
        int tallest = Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(age[i]<youngest){
                youngest = age[i];
            }
            if(height[i]>tallest){
                tallest = height[i];
            }
        }
        System.out.println("Among all the three friends, the youngest one's age is "+youngest+"\nand the height of the tallest one is "+tallest+" cm");
        sc.close();

    }
}
