// Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
// Add a new process at the end of the circular list.
// Remove a process by Process ID after its execution.
// Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
// Display the list of processes in the circular queue after each round.
// Calculate and display the average waiting time and turn-around time for all processes.
// Hint:
// Use a circular linked list to represent a queue of processes.
// Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
// Maintain the current node as the process being executed, and after each round, update the list to simulate execution.






import java.util.Scanner;

class Process {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head = null;
    Process tail = null;
    int totalProcesses = 0;
    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;

    Scanner sc = new Scanner(System.in);

    // Add a new process at the end of the circular list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head; // circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // circular link
        }
        totalProcesses++;
    }

    // Remove a process by Process ID after its execution
    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        if (head.processID == processID) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // maintaining circular link
            }
            totalProcesses--;
            return;
        }

        while (temp.next != head) {
            if (temp.next.processID == processID) {
                if (temp.next == tail) {
                    tail = temp;
                    tail.next = head; // maintaining circular link
                } else {
                    temp.next = temp.next.next;
                }
                totalProcesses--;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Process not found.");
    }

    // Simulate the scheduling of processes in a round-robin manner with a fixed time quantum
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalWaitTime = 0;
        int totalTurnaround = 0;
        Process current = head;

        while (totalProcesses > 0) {
            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                System.out.println("Process " + current.processID + " executed for " + timeQuantum + " units.");
            } else {
                totalWaitTime += (totalProcesses * timeQuantum) - current.remainingTime;
                totalTurnaround += totalProcesses * timeQuantum;
                System.out.println("Process " + current.processID + " finished execution.");
                removeProcess(current.processID);
            }
            current = current.next;
            displayProcesses();
        }
        System.out.println("Average Waiting Time: " + (float) totalWaitTime / totalProcesses);
        System.out.println("Average Turnaround Time: " + (float) totalTurnaround / totalProcesses);
    }

    // Display the list of processes in the circular queue after each round
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }
        Process temp = head;
        System.out.print("Processes in the queue: ");
        do {
            System.out.print("P" + temp.processID + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Calculate and display the average waiting time and turnaround time for all processes
    public void calculateAverageTimes() {
        System.out.println("Calculating average waiting and turnaround time...");
    }
}

public class RoundRobinCPU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Menu-driven interface
        while (true) {
            System.out.println("\nRound Robin CPU Scheduling System:");
            System.out.println("1. Add Process");
            System.out.println("2. Remove Process");
            System.out.println("3. Run Round Robin Scheduling");
            System.out.println("4. Display Processes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Process ID: ");
                    int processID = sc.nextInt();
                    System.out.print("Enter Burst Time: ");
                    int burstTime = sc.nextInt();
                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    scheduler.addProcess(processID, burstTime, priority);
                    break;

                case 2:
                    System.out.print("Enter Process ID to remove: ");
                    int removeProcessID = sc.nextInt();
                    scheduler.removeProcess(removeProcessID);
                    break;

                case 3:
                    System.out.print("Enter Time Quantum: ");
                    int timeQuantum = sc.nextInt();
                    scheduler.roundRobinScheduling(timeQuantum);
                    break;

                case 4:
                    scheduler.displayProcesses();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
