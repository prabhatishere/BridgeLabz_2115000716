// Write a program that uses FileReader to read a text file line by line and print each line to the console.
// Approach:
// Create a FileReader object to read from the file.
// Wrap the FileReader in a BufferedReader to read lines efficiently.
// Use a loop to read each line using the readLine() method and print it to the console.
// Close the file after reading all the lines.



import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Change this to your file path
        
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
