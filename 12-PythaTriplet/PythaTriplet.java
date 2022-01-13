import java.util.Scanner;

public class PythaTriplet {

  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    int a = 0, b = 0, c = 0;
    int s = 1000;
    int p = 0;

    System.out.println("What's the sum of a, b, and c?");
    s = scan.nextInt();

    for (a = 1; a < s/3; a++){

      for (b = a; b < s/2; b++){

          c = s - a - b;

          if (a*a + b*b == c*c){
            p = a * b * c;
            System.out.println(a+" "+b+" "+c);
            System.out.println(p);
          }
      }
    }

  }

}
