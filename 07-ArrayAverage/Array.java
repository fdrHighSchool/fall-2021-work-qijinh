import java.util.*;

public class Array{

  public static void main(String[] arg){
    int[] arr1 = new int[10], arr2 = new int[10];
    int min, max, maxLoc;

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter ten integers: ");
    for (int i = 0; i < arr1.length; i++){
          System.out.print((i + 1) + "=> ");
          arr1[i] = s.nextInt();
      }

    /*
    for(int i = 0; i < arr1.length; i++){
          arr1[i] = (int)(Math.random()*99) + 1;
      }
    */

    for(int i = 0; i < arr1.length; i++){
          max = 0;
          min = 0;

          for(int j = 0; j < arr1.length; j++){
              if(arr1[i] > arr1[j]){
                min = arr1[j];
                max = arr1[i];
              }
              arr2[i] = min;
              arr2[j] = max;
          }
      }

    System.out.println("List: " + Arrays.toString(arr1));
    System.out.println("Reorder: " + Arrays.toString(arr2));
    System.out.println("Mean: " + mean(arr2));
    System.out.println("Median: " + median(arr2));
    System.out.println("Mode: " + mode(arr2));
    System.out.println("Range: " + range(arr2));
  }

  public static double mean(int[] arr) {
    double total = 0.0;

    for(int i = 0; i < arr.length; i++) {
      total += arr[i];
      }

    return total / arr.length;
  }

  public static String mode(int[] arr){
    int number1 = 0;
    int number2 = 0;
    int time1 =0;
    int time2 =0;

    for (int i = 0; i < arr.length; i++){
        number1 = arr[i];
        time1 = 0;    //see edit

        for (int j = i + 1; j < arr.length; j++){
          if (number1 == arr[j]){
            time1++;
          }
        }

        if (time1 > time2){
          number2 = number1;
          time2 = time1;
        }

        else if(time1 == time2){
          number2 = Math.min(number2, number1);
        }
    }

      if(number2 != 0) return number2 + "";
      else if(number2 == 0) return "no mode";

      return "";
  }

  public static int median(int[] arr){
    int median = (arr[arr.length / 2 - 1] + arr[arr.length / 2 + 1]) / 2;
    return median;
  }

  public static int range(int[] arr){
    int range = (arr[arr.length - 1] - arr[0]);
    return range;
  }

}
