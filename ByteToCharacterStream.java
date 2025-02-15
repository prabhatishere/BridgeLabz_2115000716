// Write a program that uses InputStreamReader to read binary data from a file and print it as characters. 
// The file contains data encoded in a specific charset (e.g., UTF-8).
// Approach:
// Create a FileInputStream object to read the binary data from the file.
// Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
// Use a BufferedReader to read characters efficiently from the InputStreamReader.
// Read the file line by line and print the characters to the console.
// Handle any encoding exceptions as needed.





// chcp 65001 --> First run this command in terminal and then run your program

import java.io.*;

public class ByteToCharacterStream {
    public static void main(String[] args) {
        try(
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ){
            
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }

        }
         catch(FileNotFoundException e){
            System.out.println(e);
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
