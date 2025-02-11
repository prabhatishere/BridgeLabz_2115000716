// Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
// Add a new text state at the end of the list every time the user types or performs an action.
// Implement the undo functionality (revert to the previous state).
// Implement the redo functionality (revert back to the next state after undo).
// Display the current state of the text.
// Limit the undo/redo history to a fixed size (e.g., last 10 states).
// Hint:
// Use a doubly linked list where each node represents a state of the text.
// The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
// Keep track of the current state and adjust the next and prev pointers for undo/redo operations.




import java.util.Scanner;

class TextNode {
    String textContent;
    TextNode next;
    TextNode prev;

    public TextNode(String textContent) {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }
}

class TextEditor {
    private TextNode currentState;
    private TextNode head;
    private TextNode tail;
    private int historySize;
    private int currentSize;

    public TextEditor(int historySize) {
        this.currentState = null;
        this.head = null;
        this.tail = null;
        this.historySize = historySize;
        this.currentSize = 0;
    }

    // Add new state (text content) to the history
    public void addState(String newText) {
        TextNode newState = new TextNode(newText);

        // If history is full, remove the oldest state (head)
        if (currentSize == historySize) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            currentSize--;
        }

        // Add the new state to the end
        if (currentState == null) {
            head = newState;
            tail = newState;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
        }

        currentState = tail;  // Set current state to the latest
        currentSize++;
    }

    // Undo operation: Move to the previous state
    public void undo() {
        if (currentState == null || currentState.prev == null) {
            System.out.println("No previous state to undo.");
        } else {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.textContent);
        }
    }

    // Redo operation: Move to the next state
    public void redo() {
        if (currentState == null || currentState.next == null) {
            System.out.println("No next state to redo.");
        } else {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.textContent);
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (currentState == null) {
            System.out.println("No content to display.");
        } else {
            System.out.println("Current state: " + currentState.textContent);
        }
    }

    // Display all states in the history from start to end
    public void displayHistory() {
        TextNode temp = head;
        if (temp == null) {
            System.out.println("No history available.");
            return;
        }
        System.out.println("History of Text States:");
        while (temp != null) {
            System.out.println(temp.textContent);
            temp = temp.next;
        }
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum history size: ");
        int historySize = sc.nextInt();
        sc.nextLine(); // consume the newline character

        TextEditor editor = new TextEditor(historySize);

        while (true) {
            System.out.println("\nText Editor Menu:");
            System.out.println("1. Type text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current State");
            System.out.println("5. Display History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the new text: ");
                    String text = sc.nextLine();
                    editor.addState(text);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrentState();
                    break;

                case 5:
                    editor.displayHistory();
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
