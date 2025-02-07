// Superclass: Book
class Book {
    protected String title;
    protected int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display details of the book
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    private String name;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Displaying book info
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating an Author object with book details
        Author author = new Author("Java Programming", 2022, "John Doe", "Experienced software developer and writer.");

        // Calling displayInfo() to show the details
        author.displayInfo();
    }
}
