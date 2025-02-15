// Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
// Approach:
// Create a FileReader to read from the file and wrap it in a BufferedReader.
// Initialize a counter variable to keep track of word occurrences.
// For each line in the file, split it into words and check if the target word exists.
// Increment the counter each time the word is found.
// Print the final count.

import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) {
        int wordCount = 0;
        String targetWord = "Java";
        try {
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                String line;
                while (((line = bufferedReader.readLine()) != null)) {
                    String[] words = line.split("\\W+");
                    for (String word : words) {
                        if (word.equalsIgnoreCase(targetWord))
                            wordCount++;
                    }
                }
                System.out.println(targetWord + " found " + wordCount + " times.");

            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
