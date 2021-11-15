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
        String sign = input.substring(spacePos + 1 , spacePos + 2); //checkpoint1

        System.out.println(term1);
        System.out.println(term2);

        term1 = input1(term1);
        term2 = input2(term2);
        System.out.println(term1);
        System.out.println(term2);

        String result = produceAnswer(sign, term1, term2);
        System.out.println(result);
      }

      public static String input1(String term){
        if (term.contains("/") == true && term.contains("_") == true){
          int whole1 = whole1(term);
          int numerator1 = numerator1(term);
          int denominator1 = denominator1(term);
          String value1 = ((whole1 * denominator1 + numerator1) + "/" + denominator1);
          return value1;
        }
        else if (term.contains("/") == true && term.contains("_") == false){
          int numerator1 = numerator2(term);
          int denominator1 = denominator2(term);
          String value1 = (numerator1 + "/" + denominator1);
          return value1;
        }
        else if (term.contains("/") == false && term.contains("_") == false){
          int numerator1 = numerator3(term);
          String value1 = (numerator1 + "/" + 1);
          return value1;
        }
        return "";
      }

      public static String input2(String term){
        if (term.contains("/") == true && term.contains("_") == true){
          int whole2 = whole1(term);
          int numerator2 = numerator1(term);
          int denominator2 = denominator1(term);
          String value2 = ((whole2 * denominator2 + numerator2) + "/" + denominator2);
          return value2;
        }
        else if (term.contains("/") == true && term.contains("_") == false){
          int numerator2 = numerator2(term);
          int denominator2 = denominator2(term);
          String value2 = (numerator2 + "/" + denominator2);
          return value2;
        }
        else if (term.contains("/") == false && term.contains("_") == false){
          int numerator2 = numerator3(term);
          String value2 = (numerator2 + "/" + 1);
          return value2;
        }
        return "";
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



    public static String produceAnswer(String sign, String term1, String term2){

      int x1 = numerator2(term1);
      int y1 = denominator2(term1);
      int x2 = numerator2(term2);
      int y2 = denominator2(term2);

      if (sign.equals("+")) {
        String result = addition(x1, y1, x2, y2);
        return result;

      } else if (sign.equals("-")) {
        String result = subtraction(x1, y1, x2, y2);
        return result;

      } else if (sign.equals("*")) {
        String result = multiplication(x1, y1, x2, y2);
        return result;

      } else if (sign.equals("/")) {
        String result = division(x1, y1, x2, y2);
        return result;
      }

      return "";
    }

    public static String addition(int x1, int y1, int x2, int y2){
      if (y1 != y2){
        int numerator = x1 * y2 + x2 * y1;
        int denominator = y1 * y2;
        String result = String.valueOf(numerator + "/" + denominator);
        return result;
      }
      else{
        int numerator = x1 + x2;
        int denominator = y1;
        String result = String.valueOf(numerator + "/" + denominator);
        return result;
      }
    }


    public static String subtraction(int x1, int y1, int x2, int y2){
      if (y1 != y2){
        int numerator = x1 * y2 - x2 * y1;
        int denominator = y1 * y2;
        String result = String.valueOf(numerator + "/" + denominator);
        return result;
      }
      else{
        int numerator = x1 - x2;
        int denominator = y1;
        String result = String.valueOf(numerator + "/" + denominator);
        return result;
    }
  }


    public static String multiplication(int x1, int y1, int x2, int y2){
      int numerator = x1 * x2;
      int denominator = y1 * y2;
      String result = String.valueOf(numerator + "/" + denominator);
      return result;
    }

    public static String division(int x1, int y1, int x2, int y2){
      int numerator = x1 * y2;
      int denominator = y1 * x2;
      String result = String.valueOf(numerator + "/" + denominator);
      return result;
    }


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
