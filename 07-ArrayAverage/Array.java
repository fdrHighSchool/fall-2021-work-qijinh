import java.util.*;

public class Array{

  public static void main(String[] arg){
    double[] array = new double[30];
    for(int i = 0; i < array.length; i++){
         array[i] = (double)(Math.round((Math.random()*99.99)*100.0)/100.0);
      }

    System.out.println("List: " + Arrays.toString(array));

    int total = 0;
    for(int i = 0; i < array.length; i++){
      total += array[i];
     }
    double average = total / array.length;

    System.out.println("Average: " + average);
  }

}
