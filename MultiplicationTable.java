// Create a program to print a multiplication table of a number.
// Hint => 
// Get an integer input and store it in the number variable. Also, define a integer 
// array to store the results of multiplication from 1 to 10
// Run a loop from 1 to 10 and store the results in the multiplication table array
// Finally, display the result from the array in the format number * i = ___


import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result[] = new int[10];
        for(int i=0;i<10;i++){
            result[i] = number*(i+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(number+" * "+(i+1)+" = "+result[i]);
        }
        sc.close();

    }
}
