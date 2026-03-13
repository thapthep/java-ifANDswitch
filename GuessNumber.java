import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        try (Scanner sc = new Scanner(System.in)) {
            int guess = randomInt;
            boolean isCorrect = false;
            int score = 100;

        while (!isCorrect) {
            System.out.print("Guess the number (between 1 and 100): ");
            int userGuess = sc.nextInt();

            if (userGuess < guess) {
                System.out.println("Too low! Try again.");
                score--;
            } else if (userGuess > guess) {
                System.out.println("Too high! Try again.");
                score--;
            } else {
                System.out.println("Congratulations! You've guessed the number!");
                isCorrect = true;
            }
            
        }
        System.out.println("congratulations! you win!");
        System.out.println("Your final score is: " + score);
        sc.close();
    }
    catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number between 1 and 100.");
    }
    catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}