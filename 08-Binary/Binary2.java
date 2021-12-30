import java.util.*;

public class Binary2 {

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
    int binary[] = new int[40];
    int index = 0;

    while(num > 0){
      binary[index++] = num % 2;
      num = num / 2;
    }

    for(int i = index-1; i >= 0; i--){
      bin += binary[i];
    }

    return bin;
  }
}
