import java.util.Scanner;
public class LeapYearInSingleIf {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();  
      if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
        System.out.println(year + " is a Leap Year.");
    } else if (year >= 1582) {
        System.out.println(year + " is not a Leap Year.");
    } else {
        System.out.println("Year must be >= 1582. Please enter a valid year.");
    }
    sc.close();
  }
}