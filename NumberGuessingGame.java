// Number Guessing Game:
// ○ Write a Java program where the user thinks of a number between 1 and 100, and
// the computer tries to guess the number by generating random guesses.
// ○ The user provides feedback by indicating whether the guess is high, low, or
// correct. The program should be modular, with different functions for generating
// guesses, receiving user feedback, and determining the next guess.

import java.util.Scanner;

public class NumberGuessingGame{
    public static int guessNumber(int low, int high){
        return (int) (Math.random() * (high - low + 1)) + low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100, and I'll try to guess it..");
        int guess;
        String feedback;
        int low = 1;
        int high = 100;
        do{
            guess = guessNumber(low, high);
            System.out.println("Is your number "+guess+"? (low/high/correct)");
            feedback = sc.nextLine().toLowerCase();
            if(feedback.equals("high")){
                high = guess - 1;
            }
            else if (feedback.equals("low")){
                low = guess + 1;
            }
        }while(!feedback.equals("correct"));
        System.out.println("Yayy! I guessed it ");
        sc.close();
        
    }
}