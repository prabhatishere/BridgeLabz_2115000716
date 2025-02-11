// Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent 
// a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
// Add a movie record at the beginning, end, or at a specific position.
// Remove a movie record by Movie Title.
// Search for a movie record by Director or Rating.
// Display all movie records in both forward and reverse order.
// Update a movie's Rating based on the Movie Title.
// Hint:
// Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to 
// the previous node.
// Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
// For reverse display, start from the tail and traverse backward using the prev pointers.

import java.util.*;

class Movie{
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;
    public Movie(String title, String director, int yearOfRelease, double rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
        this.prev = null;
        this.next = null;
    }
}

class MovieList{
    Movie head = null;
    Movie tail = null;
    Scanner sc = new Scanner(System.in);
    public void addMovie(String title, String director, int yearOfRelease, double rating){
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        System.out.println("Enter 1 to add at Beginning\nEnter 2 to add at End\nEnter 3 to add at a specific position");
        int index = sc.nextInt();
        switch(index){
            case 1 : 
                if(head == null){
                    head = tail = newMovie;
                    head.prev = tail.next = null;
                }
                else{
                    head.prev = newMovie;
                    newMovie.next = head;
                    head = newMovie;
                    head.prev = null;
                }
                System.out.println("Movie added.\n\n");
                break;
            case 2 : 
                if(head == null){
                    head = tail = newMovie;
                    head.prev = tail.next = null;
                }
                else{
                    newMovie.prev = tail;
                    tail.next = newMovie;
                    tail = newMovie;
                    tail.next = null;
                }
                System.out.println("Movie added.");
                System.out.println("\n-------------------------------------\n");
                break;
            case 3 :
                System.out.println("Enter to the number of position to store the value at: ");
                int position = sc.nextInt();
                Movie current = head;
                for(int i=1; i<position-1 && current.next!=null; i++){
                    current = current.next;
                }
                newMovie.prev = current;
                newMovie.next = current.next;
                current.next = newMovie;
                current.next.prev = newMovie;
                System.out.println("Movie added.");
                System.out.println("\n-------------------------------------\n");

                break;
            default :
                System.out.println("Enter index carefully: ");
                addMovie(title, director, yearOfRelease, rating);
                break;
        }
    }
    public void deleteMovie(){
        if(head == null) return;
        System.out.println("Enter the title of movie to delete: ");
        String movieToBeDeleted = sc.nextLine();
        if(head.title == movieToBeDeleted){
            head = head.next;
            head.prev = null;
        }
            
        else{
            Movie current = head;
            while(current.next.title!=movieToBeDeleted){
                current = current.next;
            }
            current.next = current.next.next;
            current.next.prev = current;
        }
        System.out.println("Student with rollNumber: "+movieToBeDeleted+" is deleted.");
        System.out.println("\n-------------------------------------\n");
   
    }
    public void searchWithDirectorOrRating(){
        System.out.println("Enter 1 to search by Director: \nEnter 2 to search with rating: ");
        int oneOrTwo = sc.nextInt();
        if(oneOrTwo == 1){
            System.out.println("Enter director's name: ");
            String directorName = sc.nextLine();
            Movie current = head;
            while(current!=null){
                if(current.director == directorName){
                    System.out.println("Student's roll number: "+current.title);
                    System.out.println("Student's name: "+current.director);
                    System.out.println("Student's age: "+current.yearOfRelease);
                    System.out.println("Student's grade: "+current.rating);
                    System.out.println("\n\n-------------------\n\n");
                    return;
                }
                current = current.next;
            }
        }
        else if(oneOrTwo == 2){
            System.out.println("Enter rating: ");
            double rating = sc.nextDouble();
            Movie current = head;
            while(current!=null){
                if(current.rating == rating){
                    System.out.println("Movie's title: "+current.title);
                    System.out.println("Movie's director: "+current.director);
                    System.out.println("Movie's year of release: "+current.yearOfRelease);
                    System.out.println("Movie's rating: "+current.rating);
                    System.out.println("\n\n-------------------\n\n");
                    return;
                }
                current = current.next;
            }
        }
        
    }
    public void displayAllRecords(){
        System.out.println("==========================================================");
        Movie current = head;
        while(current!=null){
            System.out.println("Movie's title: "+current.title);
            System.out.println("Movie's director: "+current.director);
            System.out.println("Movie's year of release: "+current.yearOfRelease);
            System.out.println("Movie's rating: "+current.rating);
            System.out.println("\n\n-------------------\n\n");
            current = current.next;
        }
        System.out.println("==========================================================");
    }
    public void updateRating(){
        System.out.println("Enter the title of the movie to update it's rating: ");
        String titleToUpdateRating = sc.nextLine();
        Movie current = head;
        while(current!=null){
            if(current.title == titleToUpdateRating){
                System.out.println("Enter the new Rating: ");
                double newRating = sc.nextDouble();
                current.rating = newRating;
                break;
            }
            current = current.next;
        }
        
    }
}
public class MovieManagementSystem {
    public static void takeInputs(MovieList movie){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add a Movie: ");
        System.out.println("Enter 2 to delete a movie: ");
        System.out.println("Enter 3 to search for a movie: ");
        System.out.println("Enter 4 to display all records: ");
        System.out.println("Enter 5 to EXIT");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 :
                System.out.println("Enter the title of movie: ");
                String title = sc.nextLine();
                System.out.println("Enter the director of movie: ");
                String director = sc.nextLine();
                System.out.println("Enter the year of release of movie: ");
                int yearOfRelease = sc.nextInt();
                System.out.println("Enter the rating of a movie: ");
                double rating = sc.nextDouble();
                movie.addMovie(title, director, yearOfRelease, rating);
                takeInputs(movie);
                break;
            case 2 :
                movie.deleteMovie();
                takeInputs(movie);
                break;
            case 3: 
                movie.searchWithDirectorOrRating();
                takeInputs(movie);
                break;
            case 4 : 
                movie.displayAllRecords();
                takeInputs(movie);
                break;
            case 5 :
                System.out.println("--------Exited-----------");
                break;
            default :
                System.out.println("Enter the choice carefully");
                takeInputs(movie);
        }
        sc.close();
    }
    public static void main(String[] args) {
        MovieList movie = new MovieList();
        takeInputs(movie);
    }
}
