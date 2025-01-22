// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations 
// a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, c of int data type.
// Take user input for a, b, and c.
// Compute 3 integer operations and assign result to a variable
// Finally print the result and try to understand operator precedence.
// I/P => fee, discountPrecent


import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first integer a");
        int a = sc.nextInt();
        System.out.println("Enter the value of second integer b");
        int b = sc.nextInt();
        System.out.println("Enter the value of third integer c");
        int c = sc.nextInt();
        int operation1 = a + b *c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operaiton4 = a % b + c;
        System.out.println("The result of the operations a + b *c, a * b + c, c + a / b, and a % b + c respectively is "+operation1+" "+operation2+" "+operation3+" "+operaiton4);
        sc.close();


    }
    
}
