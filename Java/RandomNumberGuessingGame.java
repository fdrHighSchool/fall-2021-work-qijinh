import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame {

    public static void main(String[] args) {
        int randomNumber;
        int userNumber = 0;
        int guesses = 0;
        final int MAX = 999;
        final int MIN = 1;

        Random generator = new Random();

        // ask user if they wish to play
        System.out.println("Would you like to play the Number Guessing y / n");
        Scanner scan = new Scanner(System.in);

        // while loop to continue to execute game as long as the user enters 'yes'
        String play = scan.Next();
          while (play == "y") {

            if (play == "n")
                break; // stop the loop if answer is not yes

            randomNumber = generator.nextInt(MAX) + 1;

            System.out.println("Please pick a number between 1 and 999.");
            userNumber = scan.nextInt();

            // guesses correction
            if (userNumber > randomNumber){
                System.out.println("Number is too big, try something smaller.");
              }

            if (userNumber < randomNumber) {
                System.out.println("Number is too small, try something bigger.");
              }

            if (userNumber == randomNumber) {
                System.out.println("You got it!");
                System.out.println("Would you like to play again? y / n");
                play = scan.next();
            }

            // total guess time
            guesses++;
            System.out.println("You have guessed " + guesses + " times!");

        }
      }
    }

        // break statement skips here when 'n' is entered in
        // the game prompting question
