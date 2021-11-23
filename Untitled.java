
import java.util.*;
public class Untitled {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

        System.out.print("Please enter input equation: ");
        String input = s.nextLine();
        int totalTerms = 1;
        char temp;
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (temp == ' ')
                totalTerms++;
        }
        totalTerms = totalTerms / 2;
    }
}
