package Practice_Problem_1;
import java.util.*;
public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Celsius+" Celsius is = "+Fahrenheit);
    }

}
