import java.time.*;
import java.util.*;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Final Date: " + modifiedDate);
        sc.close();
    }
}
