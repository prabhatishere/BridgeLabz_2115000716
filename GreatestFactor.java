import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its greatest factor:");
        int number = sc.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor: " + greatestFactor);
        sc.close();
    }
}