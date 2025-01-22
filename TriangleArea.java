import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;
        System.out.println("The area of the triangle is " + areaCm2 + " cm^2 and " + areaIn2 + " in^2");
        sc.close();
    }
}
