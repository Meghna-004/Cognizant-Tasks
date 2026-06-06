import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrite_22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write: ");
        String text = sc.nextLine();
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
            System.out.println("Written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
