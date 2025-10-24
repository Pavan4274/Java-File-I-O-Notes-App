import java.io.*;
import java.util.*;

public class NotesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "notes.txt";

        while (true) {
            System.out.println("--- Notes App ---");
            System.out.println("1. Write Note");
            System.out.println("2. Read Notes");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> writeNote(filename, sc);
                case 2 -> readNotes(filename);
                case 3 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void writeNote(String filename, Scanner sc) {
        System.out.print("Enter your note: ");
        String note = sc.nextLine();
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(note + "\n");
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    
    static void readNotes(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println("--- Your Notes ---");
            String line;
            boolean empty = true;
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
                empty = false;
            }
            if (empty) System.out.println("(No notes found)");
        } catch (FileNotFoundException e) {
            System.out.println("No notes file found. Please add a note first.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
