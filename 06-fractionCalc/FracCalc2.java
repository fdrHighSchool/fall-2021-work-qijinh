import java.util.*;

public class FracCalc2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i = 1;

        while (i != 0){
          System.out.print("Please enter input equation: ");
          String input = s.nextLine();

          if (input.equals("quit")){
            System.out.println("Thank you for using Fraction Calculator");
            System. exit(1);
          }

          int spacePos1 = input.indexOf(" ");
          int spacePos2 = input.indexOf(" ", spacePos1 + 3);

          if (spacePos2 == -1){
            String term1 = input.substring(0, spacePos1);
            String term2 = input.substring(spacePos1 + 3, input.length());

            String sign1 = input.substring(spacePos1 + 1 , spacePos1 + 2);

            term1 = reformatFra(term1);
            term2 = reformatFra(term2);

            String result = produceAnswer1(sign1, term1, term2);
            if (!result.equals("Invalid Entery! (0 can't be the denominator)")){
              System.out.println("The result is: " + result);
            }
            else{
              System.out.println("Invalid Entery! (0 can't be the denominator)");
            }//checkpoint1
          }
          else if (spacePos2 != -1){
            String term1 = input.substring(0, spacePos1);
            String term2 = input.substring(spacePos1 + 3, spacePos2);
            String term3 = input.substring(spacePos2 + 3, input.length());

            String sign1 = input.substring(spacePos1 + 1 , spacePos1 + 2);
            String sign2 = input.substring(spacePos2 + 1 , spacePos2 + 2);

            term1 = reformatFra(term1);
            term2 = reformatFra(term2);
            term3 = reformatFra(term3);

            String result = produceAnswer2(sign1, sign2, term1, term2, term3);
            if (!result.equals("Invalid Entery! (0 can't be the denominator)")){
              System.out.println("The result is: " + result);
            }
            else{
              System.out.println("Invalid Entery! (0 can't be the denominator)");
            }//checkpoint1

          }
       }
      }


      public static String reformatFra(String term){
        if ((term.contains("/")) && (term.contains("_"))){
          int whole1 = whole1(term);
          int numerator1 = numerator1(term);
          int denominator1 = denominator2(term);
          String value1 = ((whole1 * denominator1 + numerator1) + "/" + denominator1);
          return value1;
        }
        else if ((term.contains("/")) && !(term.contains("_"))){
          int numerator1 = numerator2(term);
          int denominator1 = denominator2(term);
          String value1 = (numerator1 + "/" + denominator1);
          return value1;
        }
        else if (!(term.contains("/")) && !(term.contains("_"))){
          int numerator1 = numerator3(term);
          String value1 = (numerator1 + "/" + 1);
          return value1;
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



    public static String produceAnswer1(String sign, String term1, String term2){
      int x1 = numerator2(term1);
      int y1 = denominator2(term1);
      int x2 = numerator2(term2);
      int y2 = denominator2(term2);

      if (y1 == 0 || y2 == 0){
        return "Invalid Entery! (0 can't be the denominator)";
      }

      if (sign.equals("+")) {
        String result = addition(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;

      } else if (sign.equals("-")) {
        String result = subtraction(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;

      } else if (sign.equals("*")) {
        String result = multiplication(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;

      } else if (sign.equals("/")) {
        String result = division(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }

      return "";
    }

    public static String produceAnswer2(String sign1, String sign2, String term1, String term2, String term3){
      int x1 = numerator2(term1);
      int y1 = denominator2(term1);
      int x2 = numerator2(term2);
      int y2 = denominator2(term2);
      int x3 = numerator2(term3);
      int y3 = denominator2(term3);

      if (y1 == 0 || y2 == 0){
        return "Invalid Entery! (0 can't be the denominator)";
      }

      if (sign1.equals("+") && sign2.equals("+")) {
        String result = addition(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = addition(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("+") && sign2.equals("-")) {
        String result = addition(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = subtraction(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("+") && sign2.equals("*")) {
        String result = multiplication(x2, y2, x3, y3);
        x2 = numerator2(result);
        y2 = denominator2(result);
        result = addition(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("+") && sign2.equals("/")) {
        String result = division(x2, y2, x3, y3);
        x2 = numerator2(result);
        y2 = denominator2(result);
        result = addition(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }

      if (sign1.equals("-") && sign2.equals("+")) {
        String result = subtraction(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = addition(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("-") && sign2.equals("-")) {
        String result = subtraction(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = subtraction(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("-") && sign2.equals("*")) {
        String result = multiplication(x2, y2, x3, y3);
        x2 = numerator2(result);
        y2 = denominator2(result);
        result = subtraction(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("-") && sign2.equals("/")) {
        String result = division(x2, y2, x3, y3);
        x2 = numerator2(result);
        y2 = denominator2(result);
        result = subtraction(x1, y1, x2, y2);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }

      if (sign1.equals("*") && sign2.equals("+")) {
        String result = multiplication(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = addition(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("*") && sign2.equals("-")) {
        String result = multiplication(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = subtraction(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("*") && sign2.equals("*")) {
        String result = multiplication(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = multiplication(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("*") && sign2.equals("/")) {
        String result = multiplication(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = division(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }

      if (sign1.equals("/") && sign2.equals("+")) {
        String result = division(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = addition(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("/") && sign2.equals("-")) {
        String result = division(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = subtraction(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("/") && sign2.equals("*")) {
        String result = division(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = multiplication(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
        return result;
      }
      else if (sign1.equals("/") && sign2.equals("/")) {
        String result = division(x1, y1, x2, y2);
        x1 = numerator2(result);
        y1 = denominator2(result);
        result = division(x1, y1, x3, y3);
        result = simpification1(result);
        result = simpification2(result);
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


    public static String simpification1(String term){
      int x1 = numerator2(term);
      int y1 = denominator2(term);
      int gcd = 1;
      for(int i = 1; i <= x1 && i <= y1; ++i){
        if(x1%i==0 && y1%i==0)
          gcd = i; }
      String result = (x1 / gcd) + "/" + (y1 / gcd);
      return result;
    }

    public static String simpification2(String term){
      int x1 = numerator2(term);
      int y1 = denominator2(term);
      if (x1 >= y1){
        int whole = (int)Math.floor(x1 / y1);
        int numerator = x1 - whole * y1;
        if (numerator != 0){
          String result = whole + "_" + numerator + "/" + y1;
          return result;
        }
        else{
          String result = whole + "";
          return result;
        }
      }
      else{
        if (x1 == 0){
          String result = 0 + "";
          return result;
        }
        else
        return term;
      }
    }

}//end class
