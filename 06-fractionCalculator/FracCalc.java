import java.util.*;

public class fracCalc {
    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        // Checkpoint 2: Accept user input multiple times.

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter input equation: ");
        String input = s.nextLine();

        int spacePos = input.indexOf(" ");
        String term1 = input.substring(0, spacePos);
        String term2 = input.substring(spacePos + 3, input.length());
        System.out.println(term1);
        System.out.println(term2);
        String sign = input.substring(spacePos + 1 , spacePos + 2); //checkpoint1

        if (term1.contains("/") == true && term1.contains("_") == true){
          int whole1 = whole1(term1);
          int numerator1 = numerator1(term1);
          int denominator1 = denominator1(term1);
        }
        else if (term1.contains("/") == true && term1.contains("_") == false){
          int whole1 = 0;
          int numerator1 = numerator2(term1);
          int denominator1 = denominator2(term1);
        }
        else if (term1.contains("/") == false && term1.contains("_") == false){
          int whole1 = 0;
          int numerator1 = numerator3(term1);
          int denominator1 = 1;
        }


        if (term1.contains("/") == true && term1.contains("_") == true){
          int whole2 = whole1(term2);
          int numerator2 = numerator1(term2);
          int denominator2 = denominator1(term2);
        }
        else if (term1.contains("/") == true && term1.contains("_") == false){
          int whole2 = 0;
          int numerator2 = numerator2(term2);
          int denominator2 = denominator2(term2);
        }
        else if (term1.contains("/") == false && term1.contains("_") == false){
          int whole2 = 0;
          int numerator2 = numerator3(term2);
          int denominator2 = 1;
        }

        String result = calculate(sign, whole1, numerator1, denominator1, whole2, numerator2, denominator2);
       }


      public static int whole1 (String term) {
        int underLinePos = term.indexOf("_");
        int whole =  Integer.parseInt(term.substring(0, underLinePos));
        return whole;
      }
      public static int numerator1 (String term) {
        int slashPos = term.indexOf("/");
        int underLinePos = term.indexOf("_");
        int numerator =  Integer.parseInt(term.substring(underLinePos + 1, slashPos));
        return numerator;
      }
      public static int denominator1 (String term) {
        int slashPos = term.indexOf("/");
        int denominator =  Integer.parseInt(term.substring(slashPos + 1, term.length()));
        return denominator;
      }
      public static int numerator2 (String term) {
        int slashPos = term.indexOf("/");
        int numerator =  Integer.parseInt(term.substring(0, slashPos));
        return numerator;
      }
      public static int denominator2 (String term) {
        int slashPos = term.indexOf("/");
        int denominator =  Integer.parseInt(term.substring(slashPos + 1, term.length()));
        return denominator;
      }
      public static int numerator3 (String term) {
        int numerator =  Integer.parseInt(term);
        return numerator;
      }



    public static String result(String sign, int x1, int y1, int z1, int x2, int y2, int z2){
    if (sign.equals("+")) {
      String result = addition(x1, y1, z1, x2, y2, z2);
    } else if (sign.equals("-")) {
      String result = subtraction(x1, y1, z1, x2, y2, z2);
    } /*else if (sign.equals("*")) {
      String result = multiplication(x1, y1, z1, x2, y2, z2);
    } else if (sign.equals("/")) {
      String result = division(x1, y1, z1, x2, y2, z2);
    }*/
      return result;
    }

    public static String addition(int x1, int y1, int z1, int x2, int y2, int z2){
      if (x1 + x2 != 0){
      if (z1 != z2){
        int whole = x1 + x2;
        int numerator = y1 * z2 + y2 * z1;
        int denominator = z1 * z2;
        String result = String.valueOf(whole + " _ " + numerator + " / " + denominator);
        return result;
      }
      else{
        int whole = x1 + x2;
        int numerator = y1 + y2;
        int denominator = z1;
        String result = String.valueOf(whole + " _ " + numerator + " / " + denominator);
        return result;
      }
      }
      else {
        if (z1 != z2){
          int numerator = y1 * z2 + y2 * z1;
          int denominator = z1 * z2;
          String result = String.valueOf(numerator + " / " + denominator);
          return result;
        }
        else{
          int numerator = y1 + y2;
          int denominator = z1;
          String result = String.valueOf(numerator + " / " + denominator);
          return result;
      }
    }
  }


    public static String addition(int x1, int y1, int z1, int x2, int y2, int z2){
      if (x1 - x2 != 0){
      if (z1 != z2){
        int whole = x1 - x2;
        int numerator = y1 * z2 - y2 * z1;
        int denominator = z1 * z2;
        String result = String.valueOf(whole + " _ " + numerator + " / " + denominator);
        return result;
      }
      else{
        int whole = x1 - x2;
        int numerator = y1 - y2;
        int denominator = z1;
        String result = String.valueOf(whole + " _ " + numerator + " / " + denominator);
        return result;
      }
      }
      else {
        if (z1 != z2){
          int numerator = y1 * z2 - y2 * z1;
          int denominator = z1 * z2;
          String result = String.valueOf(numerator + " / " + denominator);
          return result;
        }
        else{
          int numerator = y1 - y2;
          int denominator = z1;
          String result = String.valueOf(numerator + " / " + denominator);
          return result;
      }
    }
  }

/*
    public static String multiplication(int x1, int y1, int z1, int x2, int y2, int z2){

      return result;
    }

    public static String division(int x1, int y1, int z1, int x2, int y2, int z2){

      return result;
    }
*/

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
/*
    public static int greatestCommonDivisor(int a, int b){

      return 0;
    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
/*
    public static int leastCommonMultiple(int a, int b){

      return 0;
    }//end leastCommonMultiple
*/
}//end class
