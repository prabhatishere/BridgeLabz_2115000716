// Create a program to divide N number of chocolates among M children.
// Hint => 
// Get an integer value from user for the numberOfchocolates and numberOfChildren.
// Find the number of chocolates each child gets and number of remaining chocolates
// Display the results
// I/P => numberOfchocolates, numberOfChildren
// O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are __



import java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        sc.close();
    }
}