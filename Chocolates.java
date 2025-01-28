// Create a program to divide N number of chocolates among M children. Print 
// the number of chocolates each child will get and also the remaining chocolates
// Hint => 
// Get an integer value from user for the numberOfchocolates and numberOfChildren.
// Write the method to find the number of chocolates each child gets and number of remaining chocolates
// public static int[] findRemainderAndQuotient(int number, int divisor) 

import java.util.Scanner;

public class Chocolates {
    public static int[] findChocolatesChildren(int numberOfChocolates, int numberOfChildren){
         int numberOfChocolatesPerChild = numberOfChocolates / numberOfChildren;
         int numberOfChocolatesRemaining = numberOfChocolates % numberOfChildren;
         int arr[] = {numberOfChocolatesPerChild, numberOfChocolatesRemaining};
         return arr;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Chocolates");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter number of Children");
        int numberOfChildren = sc.nextInt();
        int ans[] = findChocolatesChildren(numberOfChocolates, numberOfChildren);
        sc.close();
        System.out.println("Chocolates per child are: "+ans[0]+"\nChocolates remaining: "+ans[1]);

    }
}
