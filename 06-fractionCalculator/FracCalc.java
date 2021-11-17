import java.util.*;

public class FracCalc {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter input equation: ");
        String input = s.nextLine();

        int spacePos = input.indexOf(" ");
        String term1 = input.substring(0, spacePos);
        String term2 = input.substring(spacePos + 3, input.length());
        String sign = input.substring(spacePos + 1 , spacePos + 2); //checkpoint1

        term1 = input1(term1);
        term2 = input2(term2);

        String result = produceAnswer(sign, term1, term2);
        result = simpification1(result);
        result = simpification2(result);
        System.out.println("The result is: " + result);
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
        return term;
      }
    }

}//end class
