import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
        private List<Course> courses;
    
        public Student(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }
    
        public void enrollCourse(Course course) {
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
    
    class Professor {
        String name;
            private List<Course> courses;
        
            public Professor(String name) {
                this.name = name;
                this.courses = new ArrayList<>();
            }
        
            public void assignCourse(Course course) {
                courses.add(course);
                course.assignProfessor(this);
            }
        
            public void displayCourses() {
                System.out.println("Professor: " + name);
                for (Course course : courses) {
                    System.out.println("  Teaching: " + course.getName());
                }
            }
        }
        
        class Course {
            private String name;
            private List<Student> students;
            private Professor professor;
        
            public Course(String name) {
                this.name = name;
                this.students = new ArrayList<>();
            }
        
            public void addStudent(Student student) {
                students.add(student);
            }
        
            public void assignProfessor(Professor professor) {
                this.professor = professor;
            }
        
            public String getName() {
                return name;
            }
        
            public void displayCourseDetails() {
                System.out.println("Course: " + name);
                if (professor != null) {
                    System.out.println("  Taught by: " + professor.name);
            }
            System.out.println("  Enrolled Students:");
            for (Student student : students) {
                System.out.println("    " + student.name);
        }
    }
}

public class UniversityDemoo {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Professor drSmith = new Professor("Dr. Smith");
        Professor drJones = new Professor("Dr. Jones");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        alice.enrollCourse(math);
        bob.enrollCourse(math);
        bob.enrollCourse(science);

        drSmith.assignCourse(math);
        drJones.assignCourse(science);

        alice.displayCourses();
        bob.displayCourses();
        drSmith.displayCourses();
        drJones.displayCourses();
        
        math.displayCourseDetails();
        science.displayCourseDetails();
    }
}
