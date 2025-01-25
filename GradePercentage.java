// Create a program to take input marks of students in 3 subjects physics, chemistry,
//  and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
// Hint => 
// Take input for the number of students
// Create arrays to store marks, percentages, and grades of the students
// Take input for marks of students in physics, chemistry, and maths. If the marks are
//  negative, ask the user to enter positive values and decrement the index
// Calculate the percentage and grade of the students based on the marks
// Display the marks, percentages, and grades of each student

import java.util.Scanner;

public class GradePercentage {
    public static char calculateGrade(int percentage){
        if(percentage>=80){
            return 'A';
        }
        if(percentage>=70 && percentage<=79){
            return 'B';
        }
        if(percentage>=60 && percentage<=69){
            return 'C';
        }
        if(percentage>=50 && percentage<=59){
            return 'D';
        }
        if(percentage>=40 && percentage<=49){
            return 'E';
        }
       
        return 'R';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int totalStudents = sc.nextInt();
        int marksPhysics[] = new int[totalStudents];
        int marksChemistry[] = new int[totalStudents];
        int marksMaths[] = new int[totalStudents];
        int percentage[] = new int[totalStudents];
        char grade[] = new char[totalStudents];
        for(int i=0;i<totalStudents;i++){
            System.out.println("Enter the marks of Student: "+(i+1));
            System.out.println("In Physics");
            marksPhysics[i] = sc.nextInt();
            System.out.println("In Chemistry");
            marksChemistry[i] = sc.nextInt();
            System.out.println("In Maths");
            marksMaths[i] = sc.nextInt();
            if(marksPhysics[i]<0 || marksChemistry[i]<0 || marksMaths[i]<0){
                i--;
                System.out.println("ALERT::::::\nYou have entered invalid marks in any subject....Enter again");
            }
        }
        for(int i=0;i<totalStudents;i++){
            percentage[i] = (marksChemistry[i] + marksMaths[i] + marksPhysics[i])/3;
            grade[i] = calculateGrade(percentage[i]);
            System.out.println("Student: "+(i+1));
            System.out.println("Marks in Physics: "+marksPhysics[i]);
            System.out.println("Marks in Chemistry: "+marksChemistry[i]);
            System.out.println("Marks in Maths: "+marksMaths[i]);
            System.out.println("Total marks: "+(marksChemistry[i] + marksMaths[i] + marksPhysics[i]));
            System.out.println("Percentages are: "+percentage[i]);
            System.out.println("Grade is: "+grade[i]+"\n\n");
        }
        sc.close();

    }
}
