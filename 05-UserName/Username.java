import java.util.Scanner;

public class Username{
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);

      //ask the user their first Username
        System.out.print("Please enter your firstname:");
        String firstName = s.nextLine();

      //ask the user their last Username
        System.out.print("Please enter your lastname:");
        String lastName = s.nextLine();

      //ask the user their birthday in mm/dd/yy
        System.out.print("Hello " + firstName + ", please enter your DOB in mm/dd/yy:");
        String birthday = s.nextLine();

      //create Username
        String userName = "";

        //first letter of first name
        userName += firstName.substring(0, 1);

        //last two letter of lastname
        userName += lastName.substring(lastName.length() - 2);

        //grab the month of birth (must be 2 characters)
          if (birthday.indexOf("/") == 2){
            userName += birthday.substring(0, 2);
          } else {
            userName += "0";
            userName += birthday.substring(0, 1);
          }

        //grab the last 2 digits of the year
          userName += birthday.substring(substring.length()-2);

        //add domain name
          userName += "@anonymous.org";

        //username created
        System.out.println("Here's your username, write it down because there's no way getting it again.");
        System.out.println(userName);

    }
}
