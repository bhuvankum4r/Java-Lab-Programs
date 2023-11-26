package Program7b.src;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "your_file.txt"; // Replace with the path to your text file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            int charCount = 0;
            int lineCount = 0;
            int wordCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                charCount += line.length();
                lineCount++;
                String[] words = line.split("\\s+"); // Split line into words using space as a delimiter
                wordCount += words.length;
            }
            reader.close();
            System.out.println("Character Count: " + charCount);
            System.out.println("Line Count: " + lineCount);
            System.out.println("Word Count: " + wordCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
