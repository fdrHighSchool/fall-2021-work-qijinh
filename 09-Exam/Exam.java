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
    int min = 1000;
    int i = 0;
    int j = 0;
    int temp = (int)(Math.random() * 46) + 55;

    sampleStudent2[sampleStudent2.length - 1] = temp;
    System.out.println(Arrays.toString(sampleStudent2));

    for (int grade : sampleStudent1){
      if (grade < min){
        min = grade;
        j = i;
      }
      i++;
    }


    System.out.println("6th Grade: " + temp);
    if (temp > min)
    sampleStudent1[j] = temp;
    System.out.println(Arrays.toString(sampleStudent1));
  }

}
