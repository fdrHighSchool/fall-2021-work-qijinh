import input.until.Scanner

public class Rocket{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String country;

    System.out.println("What's your country?");
    country=Scanner input;

    triangle();
    box1();
    box2();
    box1();
    triangle();
  }

  public static void triangle() {
    System.out.println("   /\\\n  /  \\\n /    \\");
  }

   public static void box1() {
    System.out.println("+______+\n|      |\n|      |\n+______+");
   }

   public static void box2() {
     System.out.println("|      |\n|      |");
   }

}
