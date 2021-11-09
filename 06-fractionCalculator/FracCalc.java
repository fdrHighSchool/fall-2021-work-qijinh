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

        String output = produceAnswer(input);
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".

        int spacePos = input.indexOf(" ");
        String term1 = input.substring(0, spacePos);
        String term2 = input.substring(spacePos + 3, input.length());
        System.out.println(term1);
        System.out.println(term2); //checkpoint1

        if (term1.contains("/") = true && term1.contains("_") = true){
          int slashPos1 = term1.indexOf("/");
          int underLinePos1 = term1.indexOf("_");
          String whole1 = term1.substring(0, underLinePos1);
          String numerator1 = term1.substring(underLinePos1 + 1, slashPos1);
          String denominator1 = term1.substring(slashPos1 + 1, term1.length());
          System.out.print(whole1);
          System.out.print(numerator1);
          System.out.println(denominator1);
        }
        else if (term1.contains("/") = true && term1.contains("_") = false){
          int slashPos1 = term1.indexOf("/");
          String numerator1 = term1.substring(underLinePos1 + 1, slashPos1);
          String denominator1 = term1.substring(slashPos1 + 1, term1.length());
          System.out.print(numerator1);
          System.out.println(denominator1);
        }
        else if (term1.contains("/") = false && term1.contains("_") = false){
          String numerator1 = term1;
          String denominator1 = "1";
          System.out.print(numerator1);
          System.out.println(denominator1);
        }


        if (term1.contains("/") = true && term1.contains("_") = true){
          int slashPos2 = term2.indexOf("/");
          int underLinePos2 = term2.indexOf("_");
          String whole2 = term2.substring(0, underLinePos2);
          String numerator2 = term2.substring(underLinePos2 + 1, slashPos2);
          String denominator2 = term2.substring(slashPos2 + 1, term2.length());
          System.out.print(whole2);
          System.out.print(numerator2);
          System.out.println(denominator2);
        }
        else if (term1.contains("/") = true && term1.contains("_") = false){
          int slashPos2 = term2.indexOf("/");
          String numerator2 = term2.substring(underLinePos2 + 1, slashPos2);
          String denominator2 = term2.substring(slashPos2 + 1, term2.length());
          System.out.print(numerator2);
          System.out.println(denominator2);
        }
        else if (term1.contains("/") = false && term1.contains("_") = false){
          String numerator2 = term2;
          String denominator2 = "1";
          System.out.print(numerator2);
          System.out.println(denominator2);
        }//checkpoint2

/*
        String sign = input.substring(spacePos + 1 , spacePos + 2);
        if (sign.equals("+")) {
          addition(whole1, numerator1, denominator1, whole2, numerator2, denominator2);
        } else if (sign.equals("-")) {
          subtraction(whole1, numerator1, denominator1, whole2, numerator2, denominator2);
        } else if (sign.equals("*")) {
          multiplication(whole1, numerator1, denominator1, whole2, numerator2, denominator2);
        } else if (sign.equals("/")) {
          division(whole1, numerator1, denominator1, whole2, numerator2, denominator2);
        }
*/
        return "";
    }//end produceAnswer method

    public static double addition(String x1, String y1, String z1, String x2, String y2, String z2){

      return 0.0;
    }

    public static double subtraction(String x1, String y1, String z1, String x2, String y2, String z2){

      return 0.0;
    }

    public static double multiplication(String x1, String y1, String z1, String x2, String y2, String z2){

      return 0.0;
    }

    public static double division(String x1, String y1, String z1, String x2, String y2, String z2){

      return 0.0;
    }

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
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
    public static int leastCommonMultiple(int a, int b){

      return 0;
    }//end leastCommonMultiple

}//end class
