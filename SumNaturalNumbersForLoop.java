import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + (n * (n + 1) / 2));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}