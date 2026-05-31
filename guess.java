import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int maxAttempts = 10;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess the number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                guessed = true;
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (!guessed) {
            System.out.println("\nGame Over!");
            System.out.println("The correct number was: " + secretNumber);
        }

        scanner.close();
    }
}
