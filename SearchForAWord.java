// You are given an array of sentences (strings). Write a program that performs Linear Search to find the 
// first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains 
// the word, return "Not Found".
// Approach:
// Iterate through the list of sentences.
// For each sentence, check if it contains the specific word.
// If the word is found, return the current sentence.
// If no sentence contains the word, return "Not Found".

import java.util.Scanner;

public class SearchForAWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of string array: ");
        int length = sc.nextInt();
        sc.nextLine();
        String sentences[] = new String[length];
        System.out.println("Enter the sentences: ");
        for(int i=0;i<length;i++){
            sentences[i] = sc.nextLine();
        }
        System.out.println("Enter the word to match the starting word of sentence: ");
        String word = sc.next();
        for(String sentence : sentences){
            if(sentence.startsWith(word)){
                System.out.println(sentence);
                return;
            }
        }
        System.out.println("Not found");
    }
}
