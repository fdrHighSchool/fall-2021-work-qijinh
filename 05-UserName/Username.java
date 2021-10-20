import java.util.Scanner;

public class Username{
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);

      //ask the user their first Username
        System.out.println("Please enter your firstname:");
        String firstName = s.nextLine();

      //ask the user their last Username
        System.out.println("Please enter your lastname:");
        String lastName = s.nextLine();

      //ask the user their birthday in mm/dd/yy
        System.out.println("Please enter your DOB in mm/dd/yy:");
        String birthday = s.nextLine();

      //generate a username for that person based on their data
        System.out.println(firstName + " " + lastName + " " + birthday);

      //create Username
        String userName = "";

        //first letter of first name
        userName += firstName.substring(0, 1);

        //last two letter of lastname
        userName += lastName.substring(lastName.length() - 2);

        System.out.println("Here's your username, write it down because there's no way getting it again.");
        System.out.println(userName);

    }
}
