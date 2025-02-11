// Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
// Add a new student record at the beginning, end, or at a specific position.
// Delete a student record by Roll Number.
// Search for a student record by Roll Number.
// Display all student records.
// Update a student's grade based on their Roll Number.
// Hint:
// Use a singly linked list where each node contains student information and a pointer to the next node.
// The head of the list will represent the first student, and the last node’s next pointer will be null.
// Update the next pointers when inserting or deleting nodes.


import java.util.*;
class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;
    public Student( int rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList{
    Student head = null;
    Student tail = null;
    Scanner sc = new Scanner(System.in);
    public void addStudent(int rollNumber, String name, int age, char grade){
        Student newStudent = new Student(rollNumber, name, age, grade);
        System.out.println("Enter 1 to add at Beginning\nEnter 2 to add at End\nEnter 3 to add at a specific position");
        int index = sc.nextInt();
        switch(index){
            case 1 : 
                if(head == null){
                    head = tail = newStudent;
                    tail.next = null;
                }
                else{
                    newStudent.next = head;
                }
                System.out.println("Student added.");
                break;
                case 2 : 
                if(head == null){
                    head = tail = newStudent;
                    tail.next = null;
                }
                else{
                    tail.next = newStudent;
                    tail = newStudent;
                }
                System.out.println("Student added.");
                break;
                case 3 :
                System.out.println("Enter to the number of position to store the value at: ");
                int position = sc.nextInt();
                Student current = head;
                for(int i=1; i<position-1 && current.next!=null; i++){
                    current = current.next;
                }
                newStudent.next = current.next;
                current.next = newStudent;
                System.out.println("Student added.");
                break;
            default :
                System.out.println("Enter index carefully: ");
                addStudent(rollNumber, name, age, grade);
                break;
        }

    }
    public void deleteStudent(){
        if(head == null) return;
        System.out.println("Enter the roll number of student to delete: ");
        int rollNumbertobeDeleted = sc.nextInt();
        if(head.rollNumber == rollNumbertobeDeleted) head = head.next;
        else{
            Student current = head;
            while(current.next.rollNumber!=rollNumbertobeDeleted){
                current = current.next;
            }
            current.next = current.next.next;
        }
        System.out.println("Student with rollNumber: "+rollNumbertobeDeleted+" is deleted.");   
    }
    public void searchWithRollNumber(){
        System.out.println("Enter roll number of student");
        int seacrchRollNumber = sc.nextInt();
        Student current = head;
        while(current!=null){
            if(current.rollNumber == seacrchRollNumber){
                System.out.println("Student's roll number: "+current.rollNumber);
                System.out.println("Student's name: "+current.name);
                System.out.println("Student's age: "+current.age);
                System.out.println("Student's grade: "+current.grade);
                System.out.println("\n\n-------------------\n\n");
                return;
            }
            current = current.next;
        }
    }
    public void displayAllRecords(){
        Student current = head;
        while(current!=null){
            System.out.println("Student's roll number: "+current.rollNumber);
            System.out.println("Student's name: "+current.name);
            System.out.println("Student's age: "+current.age);
            System.out.println("Student's grade: "+current.grade);
            System.out.println("\n--------------------------------------------------------\n");
            current = current.next;
        }
    }
    public void updateGrade(){
        System.out.println("Enter the roll number of student to update his grade: ");
        int rollNumberToUpdateGrade = sc.nextInt();
        Student current = head;
        while(current!=null){
            if(current.rollNumber == rollNumberToUpdateGrade){
                System.out.println("Enter the new Grade: ");
                char newGrade = sc.next().charAt(0);
                current.grade = newGrade;
                break;
            }
            current = current.next;
        }
        
    }
    
}


public class StudentManagemetnSystem{
    public static void takeInputs(StudentList student){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add a student: ");
        System.out.println("Enter 2 to delete a student: ");
        System.out.println("Enter 3 to search for a student: ");
        System.out.println("Enter 4 to display all records: ");
        System.out.println("Enter 5 to EXIT");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Enter the roll number of student: ");
                int rollNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the name of student: ");
                String name = sc.nextLine();
                System.out.println("Enter the age of student: ");
                int age = sc.nextInt();
                System.out.println("Enter the grade of a student: ");
                char grade = sc.next().charAt(0);
                student.addStudent(rollNumber, name, age, grade);
                takeInputs(student);
                break;
            case 2 :
                student.deleteStudent();
                takeInputs(student);
                break;
            case 3: 
                student.searchWithRollNumber();
                takeInputs(student);
                break;
            case 4 : 
                student.displayAllRecords();
                takeInputs(student);
                break;
            case 5 :
                System.out.println("--------Exited-----------");
                break;
            default :
                takeInputs(student);
                System.out.println("Enter the choice carefully");
        }
        sc.close();
    }
    public static void main(String[] args) {
        StudentList student = new StudentList();
        takeInputs(student);
    }
}