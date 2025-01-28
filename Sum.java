// Write a program to find the sum of n natural numbers using loop
// Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 

import java.util.Scanner;

public class Sum {
    public static int calculateSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = sc.nextInt();
        int sum = calculateSum(n);
        System.out.println("The sum of "+n+" natural numers is: "+sum);
        sc.close();
    }
}
