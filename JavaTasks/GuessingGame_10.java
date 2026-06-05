import java.util.Scanner;
import java.util.Random;
public class GuessingGame_10{
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess, attempts = 0;
        System.out.println("Guess the number (1-100)!");
        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            attempts++;
            if      (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
            else    System.out.println("Correct! Took " + attempts + " attempts.");
        } while (guess != secret);
    }
}
