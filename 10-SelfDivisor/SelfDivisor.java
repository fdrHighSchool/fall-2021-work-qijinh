import java.util.*;

public class SelfDivisor {

  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Type in your number: ");
    int num1 = s.nextInt();

    System.out.println("Self-Divisor: " + isSelfDivisor(num1));

    System.out.println();
    System.out.print("Type in the starting number: ");
    int start = s.nextInt();
    System.out.print("Type in the time: ");
    int num2 = s.nextInt();

    System.out.println("First Number Self-Divisor: " + Arrays.toString(firstNumSelfDivisors(start, num2)));

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

  public static int[] firstNumSelfDivisors (int start, int num) {

    int[] list = new int[num];
    int k = 0;

    for (int i = 0; i < num ; i ++) {
        for (int j = start; j < num * start; j++) {
          if (isSelfDivisor(j) != false){
            list[k] = j;
            start = j + 1;
            j = num * start;
          }
        }
        k++;
    }

    return list;
  }

}
