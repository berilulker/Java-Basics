import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        String lastHint = "";
        int previousGuess = 0;
        boolean scolded = false;

        System.out.println("Choose a number between 1 and 100 (inclusive).");

        while (userGuess != numberToGuess) {
            System.out.print("Your guess:\t");
            userGuess = input.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("You couldn't even read the one instruction you had... Try again!");
                continue;
            }

            if (userGuess < numberToGuess) {
                if (lastHint.equals("higher") && userGuess < previousGuess) {
                    System.out.println("Are you even trying?! I said HIGHER!");
                } else {
                    System.out.println("Choose a higher number.");
                }
                lastHint = "higher";
            }
            else if (userGuess > numberToGuess) {
                if (lastHint.equals("lower") && userGuess > previousGuess) {
                    System.out.println("Seriously?! I said LOWER!");
                } else {
                    System.out.println("Choose a lower number.");
                }
                lastHint = "lower";
            }
            else {
                System.out.println("Congratulations! Your guess (" + userGuess + ") was correct!\nTotal attempts:\t" + attempts);
            }
            previousGuess = userGuess;
        }

        input.close();
    }
}