import java.util.Random;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                System.out.println("Attempts taken: " + attempts);
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}
