// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
class Employee{
    protected String name;
    protected int id;
    protected int salary;
    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

}
class Manager extends Employee{
    protected int teamSize;
    protected int deadlineDays;
    public Manager(int teamSize, int deadlineDays, String name, int id, int salary){
        super(name, id, salary);
        this.teamSize = teamSize;
        this.deadlineDays = deadlineDays;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team size: "+teamSize+", DeadLine days: "+deadlineDays);
    }
}

class Developer extends Employee{
    protected String programmingLanguage;
    public Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}

class Intern extends Employee{
    protected int internshipDuration;
    public Intern(String name, int id, int salary, int internshipDuration){
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: "+internshipDuration);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("Prabhat", 2, 59000);
        Employee manager = new Manager(5,3, "Alice", 101, 75000);
        Employee developer = new Developer("Bob", 102, 65000, "Java");
        Employee intern = new Intern("Charlie", 103, 30000, 6);
        emp.displayDetails();
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
