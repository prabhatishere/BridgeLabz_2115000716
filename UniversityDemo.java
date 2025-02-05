import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        for (Department dept : departments) {
            dept.displayDepartmentDetails();
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("  " + faculty.getName());
        }
    }
}

class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayDepartmentDetails() {
        System.out.println("Department: " + name);
        for (Faculty faculty : facultyMembers) {
            System.out.println("  Faculty: " + faculty.getName());
        }
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University university = new University("Tech University");
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        Faculty drSmith = new Faculty("Dr. Smith");
        Faculty drJones = new Faculty("Dr. Jones");

        university.addFaculty(drSmith);
        university.addFaculty(drJones);

        university.displayUniversityDetails();
    }
}
