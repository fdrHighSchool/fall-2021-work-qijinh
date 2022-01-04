import java.util.*;

public class Exam {

  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int[] sampleStudent1 = new int[5];
    int[] sampleStudent2 = new int[sampleStudent1.length + 1];

    for(int i = 0; i < sampleStudent1.length; i++) {
      sampleStudent1[i] = (int)(Math.random() * 46) + 55;
      sampleStudent2[i] = sampleStudent1[i];
    }

    System.out.println(Arrays.toString(sampleStudent1));

    sixthGrade(sampleStudent1, sampleStudent2);
  }


  public static void sixthGrade(int[] sampleStudent1, int[] sampleStudent2){
    int temp1 = 0;
    int temp2 = (int)(Math.random() * 46) + 55;

    sampleStudent2[sampleStudent2.length - 1] = temp2;
    System.out.println(Arrays.toString(sampleStudent2));

    for (int i = 0; i <= sampleStudent1.length - 1; i++){
      for (int j = i + 1; j <= sampleStudent1.length - 1; j++){
        if (sampleStudent1[i] > sampleStudent1[j]){
          temp1 = sampleStudent1[i];
          sampleStudent1[i] = sampleStudent1[j];
          sampleStudent1[j] = temp1;
        }
      }
    }

    System.out.println("6th Grade: " + temp2);
    sampleStudent1[0] = temp2;
    System.out.println(Arrays.toString(sampleStudent1));
  }

}
