// Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:
// Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().




// Superclass: Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method for subclasses to implement
    public void displayRole() {
        System.out.println("Role: Person");
    }
}

// Subclass: Teacher extends Person
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayRole method to describe teacher role
    @Override
    public void displayRole() {
        super.displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student extends Person
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayRole method to describe student role
    @Override
    public void displayRole() {
        super.displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff extends Person
class Staff extends Person {
    private String position;

    // Constructor
    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    // Overriding displayRole method to describe staff role
    @Override
    public void displayRole() {
        super.displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Position: " + position);
    }
}

// Main class
public class ResturantManagementSystem {
    public static void main(String[] args) {
        // Creating objects of Teacher, Student, and Staff
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 18, "Grade 12");
        Staff staff = new Staff("Charlie", 40, "Janitor");

        // Displaying role and details for each object
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
