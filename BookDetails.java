// Problem Statement: Write a program to create a Book class with attributes title, author, and price. 
// Add a method to display the book details.

class Book{
    String title;
    String author;
    int price;
    // Constructor to initialize the attributes
    Book(String title, String author, int price){
        this.author = author;
        this.title = title;
        this.price = price;

    }
    // Display book details
    public void displayBookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("The Tempest", "William Shakespeare",2000);
        book.displayBookDetails();
    }
    
}
