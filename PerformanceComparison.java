// Write a program that:
// Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
// Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
// Approach:
// StringBuilder and StringBuffer:
// Create a list of strings (e.g., "hello").
// Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
// Measure and compare the time taken for each.
// FileReader and InputStreamReader:
// Read a large text file (100MB) using FileReader and InputStreamReader.
// Count the number of words by splitting the text on whitespace characters.
// Print the word count and compare the time taken for reading the file.

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PerformanceComparison {
    public static void main(String[] args) {
        compareStringConcatenation();
        
        String filePath = "largeFile.txt"; 
        compareFileReading(filePath);
    }
    private static void compareStringConcatenation() {
        final int iterations = 1_000_000;
        String text = "hello";
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");
        
        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    private static void compareFileReading(String filePath) {
        long startTime, endTime;
        int wordCount;
        startTime = System.nanoTime();
        wordCount = countWordsUsingFileReader(filePath);
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount + ", time: " + (endTime - startTime) / 1_000_000 + " ms");
        startTime = System.nanoTime();
        wordCount = countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount + ", time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    private static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }
    private static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }
}
