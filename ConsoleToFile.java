// Write a program that uses InputStreamReader to read user input from the console and write the input 
// to a file. Each input should be written as a new line in the file.
// Approach:
// Create an InputStreamReader to read from System.in (the console).
// Wrap the InputStreamReader in a BufferedReader for efficient reading.
// Create a FileWriter to write to the file.
// Read user input using readLine() and write the input to the file.
// Repeat the process until the user enters "exit" to stop inputting.
// Close the file after the input is finished.








import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        
        
        // // Define the file to write input to
                // String filePath = "output.txt";
                
                // // Try-with-resources to ensure streams are properly closed
                // try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                //      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                //      FileWriter fileWriter = new FileWriter(filePath, true); // Append mode
                //      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                    
                //     System.out.println("Enter text (type 'exit' to stop):");
                //     String line;
                //     while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                //         bufferedWriter.write(line);
                //         bufferedWriter.newLine(); // Add a new line after each input
                //     }
                    
                //     System.out.println("Input saved to " + filePath);
                // } catch (IOException e) {
                //     System.err.println("Error handling input or file: " + e.getMessage());
                // }
                
        String filePath = "output.txt";
        try(
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ){
            System.out.println("Enter the text (Enter 'exit' to stop writing)");
            String line;
            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("====EXITED======");

    }
}
