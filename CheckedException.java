import java.io.*;

class Test1 {
    public static void print() {
        String filePath = "data.txt";
        readFile(filePath);
    }

    private static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            System.out.println("File Contents:\n" + content);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }
}

public class CheckedException {
    public static void main(String[] args) {
        Test1.print();
    }
}
