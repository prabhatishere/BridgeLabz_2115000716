import java.util.*;

public class Temperature {
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        String type = sc.next();
        if (type.equals("C")) {
            System.out.println(toFahrenheit(temp));
        } else {
            System.out.println(toCelsius(temp));
        }
        sc.close();
    }
}
