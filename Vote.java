// Write a program to take user input for the age of all 10 students in a class and
//  check whether the student can vote depending on his/her age is greater or equal to 18.
// Hint => 
// Define an array of 10 integer elements and take user input for the student's age. 
// Loop through the array using the length property and for the element of the array check If the age is a 
// negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. 
// Otherwise, print The student with the age ___ cannot vote. 

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentAge[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the age of Student: "+(i+1));
            studentAge[i] = sc.nextInt();
            if(studentAge[i]<0) System.out.println("An Invalid Age");
            else if(studentAge[i]>=18) System.out.println("The student with the age "+studentAge[i]+" can vote");
            else System.out.println("The student with the age "+studentAge[i]+" cannot vote");

        }
        sc.close();
    }
       
}
