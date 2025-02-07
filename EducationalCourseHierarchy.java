// Base class: Course
class Course {
    protected String courseName;
    protected int duration; // Duration in hours

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display basic course info
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse extends Course
class OnlineCourse extends Course {
    private String platform; // Platform where the course is available
    private boolean isRecorded; // Whether the course is recorded

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseInfo method to include online course details
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Displaying course name and duration
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee; // Fee for the course
    private double discount; // Discount on the course

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayCourseInfo method to include paid course details
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Displaying online course info
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}

// Main class
public class EducationalCourseHierarchy{
    public static void main(String[] args) {
        // Creating a PaidOnlineCourse object
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 150.0, 20.0);

        // Calling displayCourseInfo to show the course details
        course.displayCourseInfo();
    }
}
