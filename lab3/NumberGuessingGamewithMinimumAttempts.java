import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGamewithMinimumAttempts {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // number between 1 and 100
        int attempts = 0;
        final int maxAttempts = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Guessing Game");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

        do {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess (1-100): ");

            try {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("You guessed the correct number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the input buffer
            }
        } while (attempts < maxAttempts);

        if (attempts == maxAttempts) {
            System.out.println("You lose! You've run out of attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
