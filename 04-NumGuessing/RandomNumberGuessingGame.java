import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame {

    public static void main(String[] args) {
        int randomNumber;
        int userNumber = 0;
        int guesses = 0;
        final int MAX = 999;
        String play;

        Scanner s = new Scanner(System.in);

        Random generator = new Random();

        // ask user if they wish to play
        System.out.println("Would you like to play the Number Guessing y / n");
        play = s.next();


        // while loop to continue to execute game as long as the user enters 'yes'
        //if (play == "n"){
          //  System.out.println("Game Stop!");
            //System. exit(1); // stop the loop if answer is not yes
          //}

          if (play.equals("y")) {
            System.out.println("Game Start!");
            System.out.println("Please pick a number between 1 and 999.");
            }

          else {
            System.out.println("you're no fun...go away!");
          }

          while (play != "y") {
            randomNumber = generator.nextInt(MAX) + 1;
            userNumber = s.nextInt();

            // guesses correction
            if (userNumber > randomNumber){
                System.out.println("Number is too big, try something smaller.");
              }

            if (userNumber < randomNumber) {
                System.out.println("Number is too small, try something bigger.");
              }

            if (userNumber == randomNumber) {
                System.out.println("You got it!");
                System.out.println("You have guessed " + guesses + " times!");
                System.out.println("Would you like to play again? y / n");
                play = s.next();
            }

            // total guess time
            guesses++;
            }



      }
    }

        // break statement skips here when 'n' is entered in
        // the game prompting question
