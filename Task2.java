import java.util.*;

public class Task2 {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;
        System.out.print("\n");

       
        while (playAgain) {
            int lowerBound = 1;
            int upperBound = 100;
            int attempts = 0;
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int guess;
            boolean hasUsedHint = false;

            System.out.println("\nI've selected a number between " + lowerBound + " and " + upperBound + ".");
            System.out.print("\n");

            while (true) {
                System.out.print("==Enter your guess: ");
                guess = input.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out
                            .println(" You've guessed the number " + secretNumber + " in " + attempts
                                    + " attempts.");
                    System.out.print("\n");

                    totalAttempts += attempts;
                    roundsWon++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low.");
                    System.out.print("\n");

                } else {
                    System.out.println("Your guess is too high.");
                    System.out.print("\n");

                }

                if (attempts == 2 && !hasUsedHint) {
                    System.out.print("Do you want to use a hint? (yes/no): ");
                    String hintChoice = input.next().toLowerCase();
                    if (hintChoice.equals("yes")) {
                        System.out.println("Hint: The number is " + (secretNumber % 2 == 0 ? "even" : "odd") + ".");
                        System.out.print("\n");
                        hasUsedHint = true;
                    }
                }

                if (attempts >= 3) {
                    System.out.println("You've used all your attempts. The number was " + secretNumber + ".");
                    System.out.print("\n");

                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            System.out.print("\n");

            String playAgainResponse = input.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        double averageAttempts = (double) totalAttempts / roundsWon;
        System.out.print("\n");

        // System.out.println("");
        System.out.println("Your total score is: " + roundsWon + " rounds won.");
        System.out.println("Your average attempts per round: " + String.format("%.2f", averageAttempts));
        System.out.print("\n");
        input.close();
       
       
    }
}