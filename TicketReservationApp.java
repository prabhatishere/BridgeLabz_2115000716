// Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
// Add a new ticket reservation at the end of the circular list.
// Remove a ticket by Ticket ID.
// Display the current tickets in the list.
// Search for a ticket by Customer Name or Movie Name.
// Calculate the total number of booked tickets.

// Hint:
// Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
// When removing a ticket, update the circular pointers accordingly.
// For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.




import java.util.Scanner;

class TicketNode {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private TicketNode head = null;
    private TicketNode tail = null;
    private int ticketCount = 0;

    // Add a new ticket reservation at the end
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head; // Circular link
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Circular link
        }

        ticketCount++;
        System.out.println("Ticket reserved successfully!");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode previous = null;

        do {
            if (current.ticketID == ticketID) {
                if (previous == null) { // Removing head node
                    head = head.next;
                    tail.next = head; // Update circular link
                } else {
                    previous.next = current.next;
                    if (current == tail) { // If we're removing the tail
                        tail = previous;
                    }
                }
                ticketCount--;
                System.out.println("Ticket with ID " + ticketID + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all current tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID);
            System.out.println("Customer Name: " + current.customerName);
            System.out.println("Movie Name: " + current.movieName);
            System.out.println("Seat Number: " + current.seatNumber);
            System.out.println("Booking Time: " + current.bookingTime);
            System.out.println("------------------------------");
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        boolean found = false;

        do {
            if (current.customerName.contains(searchTerm) || current.movieName.contains(searchTerm)) {
                System.out.println("Ticket ID: " + current.ticketID);
                System.out.println("Customer Name: " + current.customerName);
                System.out.println("Movie Name: " + current.movieName);
                System.out.println("Seat Number: " + current.seatNumber);
                System.out.println("Booking Time: " + current.bookingTime);
                System.out.println("------------------------------");
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found with the search term: " + searchTerm);
        }
    }

    // Calculate and display the total number of booked tickets
    public void totalTickets() {
        System.out.println("Total tickets booked: " + ticketCount);
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketReservationSystem system = new TicketReservationSystem();

        while (true) {
            System.out.println("\nTicket Reservation System Menu:");
            System.out.println("1. Reserve a new ticket");
            System.out.println("2. Remove a ticket by Ticket ID");
            System.out.println("3. Display all tickets");
            System.out.println("4. Search for a ticket by Customer Name or Movie Name");
            System.out.println("5. Display total booked tickets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int ticketID = sc.nextInt();
                    sc.nextLine(); // consume the newline character
                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();
                    System.out.print("Enter Seat Number: ");
                    String seatNumber = sc.nextLine();
                    System.out.print("Enter Booking Time: ");
                    String bookingTime = sc.nextLine();
                    system.addTicket(ticketID, customerName, movieName, seatNumber, bookingTime);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to remove: ");
                    int removeID = sc.nextInt();
                    system.removeTicket(removeID);
                    break;

                case 3:
                    system.displayTickets();
                    break;

                case 4:
                    System.out.print("Enter Customer Name or Movie Name to search: ");
                    String searchTerm = sc.nextLine();
                    system.searchTicket(searchTerm);
                    break;

                case 5:
                    system.totalTickets();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
