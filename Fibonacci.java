import java.util.*;

public class Fibonacci {
    static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        generateFibonacci(terms);
        sc.close();
    }
}
