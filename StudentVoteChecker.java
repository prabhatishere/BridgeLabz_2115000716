// Write a program to take user input for the age of all 10 students in a class and check whether the 
// student can vote depending on his/her age is greater or equal to 18.
// Hint => 
// Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) 
// which takes in age as a parameter and returns true or false
// Inside the method firstly validate the age for a negative number, if a negative return is false cannot 
// vote. For valid age check for age is 18 or above return true; else return false;
// In the main function define an array of 10 integer elements, loop through the array by take user input 
// for the student's age, call canStudentVote() and display the result

import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        if(age<0) return false;
        if(age>=18) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();
        int ages[] = new int[10];
        System.out.println("Enter the ages of students: ");
        for(int i=0;i<ages.length;i++){
            System.out.println("Enter the age of student "+i+1);
            ages[i] = sc.nextInt();
            if(obj.canStudentVote(ages[i])){
                System.out.println("Student with the age "+ages[i]+" can vote");
            }
            else{
                System.out.println("Student with the age "+ages[i]+" cannot vote");

            }
        }
        sc.close();

    }
}