import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame {

    public static void main(String[] args) {
        int randomNumber = 0;
        int userNumber = 0;
        int guesses = 0;
        int max = 0;

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
              max = 99;
              randomNumber = (int)(Math.random()*max + 1);
              //randomNumber = generator.nextInt(max) + 1;
            }

            if (level.equals("medium")) {
              max = 999;
              randomNumber = (int)(Math.random()*max + 1);
              //randomNumber = generator.nextInt(max) + 1
            }

            if (level.equals("difficult")) {
              max = 9999;
              randomNumber = (int)(Math.random()*max + 1);
              //randomNumber = generator.nextInt(max) + 1;
            }

            if (level.equals("hell")){
              max = 99999999;
              randomNumber = (int)(Math.random()*max + 1);
              //randomNumber = generator.nextInt(max) + 1;
            }


              while (play.equals("y")) {
                System.out.println("Please pick a number between 1 and " + max + ".");
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
