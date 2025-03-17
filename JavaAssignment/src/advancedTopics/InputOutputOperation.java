package advancedTopics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputOperation {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Path to the text file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Print each line of the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
