// Concepts: Generic Classes, Wildcards, Bounded Type Parameters
// Problem Statement:
// Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
// Hints:
// Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
// Implement a generic class Course<T extends CourseType> to manage different courses.
// Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.

import java.util.*;
abstract class CourseType {
    String evaluationMethod;
    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }
    public abstract void displayEvaluationDetails();
}
class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
    @Override
    public void displayEvaluationDetails() {
        System.out.println("Evaluation Method: " + evaluationMethod + " - Final Exam");
    }
}
class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
    @Override
    public void displayEvaluationDetails() {
        System.out.println("Evaluation Method: " + evaluationMethod + " - Assignments");
    }
}
class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
    @Override
    public void displayEvaluationDetails() {
        System.out.println("Evaluation Method: " + evaluationMethod + " - Research Paper");
    }
}
class Course<T extends CourseType> {
    String courseName;
    T courseType;
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        courseType.displayEvaluationDetails();
    }
}
public class University {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayEvaluationDetails();
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> assignmentCourse = new Course<>("Computer Science", new AssignmentCourse());
        Course<ResearchCourse> researchCourse = new Course<>("Physics", new ResearchCourse());
        examCourse.displayCourseDetails();
        assignmentCourse.displayCourseDetails();
        researchCourse.displayCourseDetails();
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse());
        allCourses.add(new AssignmentCourse());
        allCourses.add(new ResearchCourse());
        displayAllCourses(allCourses);
    }
}
