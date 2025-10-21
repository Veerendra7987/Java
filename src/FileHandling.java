import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
      
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

      
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a sample file handling example in Java!\n");
            writer.write("File handling includes create, write, read, and delete operations.");
            writer.close();
            System.out.println("Successfully wrote to the file.")
              
            System.out.println("\nReading file content:");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

    
            if (file.delete()) {
                System.out.println("\nFile deleted successfully: " + file.getName());
            } else {
                System.out.println("\nFailed to delete the file.");
