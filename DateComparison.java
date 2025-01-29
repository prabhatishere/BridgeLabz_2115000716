import java.time.*;
import java.util.*;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y1 = sc.nextInt(), m1 = sc.nextInt(), d1 = sc.nextInt();
        int y2 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();

        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        if (date1.isBefore(date2)) System.out.println("First date is before the second date");
        else if (date1.isAfter(date2)) System.out.println("First date is after the second date");
        else System.out.println("Both dates are the same");

        sc.close();
    }
}
