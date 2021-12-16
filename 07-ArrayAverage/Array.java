import java.util.*;

public class Array{

  public static void main(String[] arg){
    int[] arr = new int[10];
    for(int i = 0; i < arr.length; i++){
         arr[i] = (int)(Math.random()*99) + 1;
      }

    System.out.println("List: " + Arrays.toString(arr));
    System.out.println("Mean: " + mean(arr));
    System.out.println("Median: " + median(arr));
    System.out.println("Mode: " + mode(arr));
    System.out.println("Range: " + range(arr));
  }

  public static double mean(int[] arr) {
    double total = 0.0;

    for(int i = 0; i < arr.length; i++) {
      total += arr[i];
      }

    return total / arr.length;
  }

  public static int mode(int[] arr){
    Arrays.sort(arr);
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

    return number2;
  }

  public static int median(int[] arr){
    Arrays.sort(arr);
    int median = (arr[arr.length / 2 - 1] + arr[arr.length / 2 + 1]) / 2;
    return median;
  }

  public static int range(int[] arr){
    Arrays.sort(arr);
    int range = (arr[arr.length - 1] - arr[0]);
    return range;
  }

}
