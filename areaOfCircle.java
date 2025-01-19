package Practice_Problem_1;
import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();
        double Area = 3.14159265 * radius*radius;
        System.out.println("The area of the given radius is "+Area);

    }

}
