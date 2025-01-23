import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for (int i = 1; i <= max; i++) {
            System.out.println(i + (i % 2 == 0 ? " is even" : " is odd"));
        }
        sc.close();
    }
}
