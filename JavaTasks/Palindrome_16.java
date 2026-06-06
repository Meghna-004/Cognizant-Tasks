import java.util.Scanner;
public class Palindrome_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "It IS a palindrome." : "It is NOT a palindrome.");
    }
}