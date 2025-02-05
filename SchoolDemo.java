import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            student.displayCourses();
        }
    }
}

class Student {
    String name;
        private List<Course> courses;
    
        public Student(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }
    
        public void enrollInCourse(Course course) {
            courses.add(course);
            course.addStudent(this);
        }
    
        public void displayCourses() {
            System.out.println("Student: " + name);
            for (Course course : courses) {
                System.out.println("  Enrolled in: " + course.getName());
            }
        }
    }
    
    class Course {
        private String name;
        private List<Student> students;
    
        public Course(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }
    
        public void addStudent(Student student) {
            students.add(student);
        }
    
        public String getName() {
            return name;
        }
    
        public void displayStudents() {
            System.out.println("Course: " + name);
            for (Student student : students) {
                System.out.println("  Student: " + student.name);
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(math);

        school.addStudent(alice);
        school.addStudent(bob);

        school.displayStudents();
        math.displayStudents();
        science.displayStudents();
    }
}
