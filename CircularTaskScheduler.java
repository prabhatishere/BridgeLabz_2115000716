// Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
// Add a task at the beginning, end, or at a specific position in the circular list.
// Remove a task by Task ID.
// View the current task and move to the next task in the circular list.
// Display all tasks in the list starting from the head node.
// Search for a task by Priority.
// Hint:
// Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
// Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
// When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.



import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head = null;
    Task tail = null;
    Task currentTask = null;
    Scanner sc = new Scanner(System.in);

    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        System.out.println("Enter 1 to add at Beginning\nEnter 2 to add at End\nEnter 3 to add at a specific position");
        int index = sc.nextInt();
        
        switch (index) {
            case 1:
                if (head == null) {
                    head = tail = newTask;
                    tail.next = head;
                } else {
                    newTask.next = head;
                    head = newTask;
                    tail.next = head;
                }
                System.out.println("Task added.");
                break;

            case 2:
                if (head == null) {
                    head = tail = newTask;
                    tail.next = head;
                } else {
                    tail.next = newTask;
                    tail = newTask;
                    tail.next = head;
                }
                System.out.println("Task added.");
                break;

            case 3:
                System.out.println("Enter the position to add the task: ");
                int position = sc.nextInt();
                if (position == 1) {
                    newTask.next = head;
                    head = newTask;
                    tail.next = head;
                } else {
                    Task temp = head;
                    for (int i = 1; i < position - 1 && temp.next != head; i++) {
                        temp = temp.next;
                    }
                    newTask.next = temp.next;
                    temp.next = newTask;
                    if (temp == tail) {
                        tail = newTask;
                    }
                }
                System.out.println("Task added.");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
                addTask(taskId, taskName, priority, dueDate);
        }
    }

    public void removeTaskById() {
        if (head == null) return;

        System.out.println("Enter the Task ID to delete: ");
        int taskIdToDelete = sc.nextInt();

        if (head.taskId == taskIdToDelete) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Task deleted.");
            return;
        }

        Task temp = head;
        while (temp.next != head && temp.next.taskId != taskIdToDelete) {
            temp = temp.next;
        }

        if (temp.next.taskId == taskIdToDelete) {
            temp.next = temp.next.next;
            if (tail.taskId == taskIdToDelete) {
                tail = temp;
            }
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void viewCurrentTask() {
        if (currentTask == null) {
            currentTask = head;
        }
        if (currentTask != null) {
            System.out.println("Current Task: ");
            System.out.println("Task ID: " + currentTask.taskId);
            System.out.println("Task Name: " + currentTask.taskName);
            System.out.println("Priority: " + currentTask.priority);
            System.out.println("Due Date: " + currentTask.dueDate);
            currentTask = currentTask.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println("----------------------------");
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTaskByPriority() {
        System.out.println("Enter the priority to search: ");
        int searchPriority = sc.nextInt();
        Task temp = head;
        boolean found = false;

        if (head != null) {
            do {
                if (temp.priority == searchPriority) {
                    System.out.println("Task Found:");
                    System.out.println("Task ID: " + temp.taskId);
                    System.out.println("Task Name: " + temp.taskName);
                    System.out.println("Priority: " + temp.priority);
                    System.out.println("Due Date: " + temp.dueDate);
                    System.out.println("----------------------------");
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
        }

        if (!found) {
            System.out.println("No tasks found with priority " + searchPriority);
        }
    }
}

public class CircularTaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();
        
        while (true) {
            System.out.println("1. Add a Task");
            System.out.println("2. Remove a Task by Task ID");
            System.out.println("3. View Current Task and Move to Next");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Search Task by Priority");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Task ID: ");
                    int taskId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Task Name: ");
                    String taskName = sc.nextLine();
                    System.out.println("Enter Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Due Date (DD-MM-YYYY): ");
                    String dueDate = sc.nextLine();
                    scheduler.addTask(taskId, taskName, priority, dueDate);
                    break;
                case 2:
                    scheduler.removeTaskById();
                    break;
                case 3:
                    scheduler.viewCurrentTask();
                    break;
                case 4:
                    scheduler.displayAllTasks();
                    break;
                case 5:
                    scheduler.searchTaskByPriority();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
