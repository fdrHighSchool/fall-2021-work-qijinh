import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame {

    public static void main(String[] args) {
        int randomNumber;
        int userNumber = 0;
        int guesses = 0;
        final int MAX1 = 99;
        final int MAX2 = 999;
        final int MAX3 = 9999;
        final int MAX4 = 99999999;
        int MAX;

        String play;
        String level;
        Scanner s = new Scanner(System.in);
        Random generator = new Random();

        // ask user if they wish to
        System.out.println("Would you like to play the Number Guessing? y / n");
        play = s.next();

        if (play.equals("y")) {
          System.out.println("Game Start!");
          //code continue if the user enters yes
          System.out.println("What level do you like to play? easy / medium / difficult / hell");
          level = s.next();

            if (level.equals("easy")) {
              MAX = 99;
            }

            if (level.equals("medium")) {
              MAX = 999;
            }

            if (level.equals("difficult")) {
              MAX = 9999;
            }

            if (level.equals("hell")){
              MAX = 99999999;
            }

            randomNumber = generator.nextInt(MAX) + 1;

              while (play.equals("y")) {
                System.out.println("Please pick a number between 1 and " + MAX + " .");
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
                guesses++;
                // total guess time
              }
          }


          else {
            System.out.println("you're no fun...go away!");
            System. exit(1);
            // stop the code if answer is not yes
          }


      }
    }

        // break statement skips here when 'n' is entered in
        // the game prompting question
