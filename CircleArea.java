// Problem Statement: Write a program to create a Circle class with an attribute radius. 
// Add methods to calculate and display the area and circumference of the circle.
class Circle{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    // Calculate Area of Circle
    public void calculateArea(){
        double area = 3.14 *radius *radius;
        System.out.println("The area of the circle with radius "+radius+" is " +area);
    }
    // Calculate the circumference of the cirle
    public void calculateCircumference(){
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of the circle with radius "+radius+" is " +circumference);
    }

}
public class CircleArea {
    public static void main(String[] args) {
        Circle radius = new Circle(3.4);
        Circle radius1 = new Circle(3);
        radius.calculateArea();
        radius.calculateCircumference();
        radius1.calculateArea();
        radius1.calculateCircumference();
    }
}
