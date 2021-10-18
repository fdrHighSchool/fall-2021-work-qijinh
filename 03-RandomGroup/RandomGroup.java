import java.util.*;

public class RandomGroup {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("How many groups?");
      int numGroups = s.nextInt();

      int randomChoice = (int)(Math.random()*numGroups +1);

      System.out.println("Group number " + randomChoice + " has been chosen!");
      // System.out.println(numGroups + 1);

    }
}
