// Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. 
// Add a method to display the details.

class Employee{
    String name;
    int id;
    int salary;
    Employee(int id, int salary, String name){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    // Display details of employee
    public void displayEmployeeDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
}
public class EmployeeDetails{
    public static void main(String[] args) {
        Employee emp2 = new Employee(2,250005,"Prashant");
        Employee emp4 = new Employee(4,250003,"Chintu");
        Employee emp6 = new Employee(6,250000,"Shailendra");
        System.out.println("--------Details of 1st Employee-------");
        emp2.displayEmployeeDetails();
        System.out.println("\n--------Details of 2nd Employee-------");
        emp4.displayEmployeeDetails();
        System.out.println("\n--------Details of 3rd Employee-------");
        emp6.displayEmployeeDetails();

    }
}