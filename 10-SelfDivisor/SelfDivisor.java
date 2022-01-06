import java.util.*;

public class SelfDivisor {

  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Type in your number: ");
    int num = s.nextInt();

    System.out.println(isSelfDivisor(num));

  }

  public static boolean isSelfDivisor (int number) {

    int temp = number;
    int digit = 0;

    while (temp > 0){
      digit = temp % 10;

      if (digit == 0) return false;
      if (number % digit != 0) return false;

      temp = temp / 10;
    }

    return true;
  }

}
