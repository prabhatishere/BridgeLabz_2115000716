
import java.io.*;

class TryWithResources {
    public static void print() {
        String filePath = "info.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstLine = reader.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    
    public static void main(String[] args) {
        print();
    }
}
