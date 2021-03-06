import java.util.*;

public class Binary {

  public static void main(String[] arg){

    while(1 > 0){
      Scanner s = new Scanner(System.in);

      System.out.println("1 -- Convert Binary To Decimal");
      System.out.println("2 -- Convert Decimal To Binary");
      String input = s.nextLine();
      System.out.println();

      if (input.equals("1")){
        System.out.println("What is your binary number?");
        String num = s.nextLine();
        System.out.println("Decimal conversion: " + binaryToDecimal(num));
        System.out.println();
      }
      else if (input.equals("2")){
        System.out.println("What is your decimal number?");
        int num = s.nextInt();
        System.out.println("Binary conversion: " + decimalToBinary(num));
        System.out.println();
      }
      else {
        System.out.println("Goodbye!");
        System.exit(0);
      }
    }
  }

  public static int binaryToDecimal(String num){
    int dec = 0;
    int base = 1;
    int len = num.length();

    for (int i = len - 1; i >= 0; i--){
      if(num.charAt(i) == '1'){
        dec += base;
      }
      base = base * 2;
    }
    return dec;
  }

  public static String decimalToBinary(int num){
    String bin = "";
    int pow = 1;
    double pow2 = 0.0;

    for (int i = num - 1; i >= 0; i--){
      pow2 = Math.pow(2, i);
      pow = (int)Math.round(pow2);

      if (num >= pow){
        bin += "1";
        num = num - pow;
      }
      else if (num < pow && bin.contains("1")){
        bin += "0";
      }
    }
    return bin;
  }
}
