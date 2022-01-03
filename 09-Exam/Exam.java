import java.util.*;

public class Exam {

  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int[] sampleStudent = new int[5];

    for(int i = 0; i < sampleStudent.length; i++) {
      sampleStudent[i] = (int)(Math.random() * 46) + 55;
    }

    System.out.println(Arrays.toString(sampleStudent));
    sixthGrade(sampleStudent);
  }


  public static void sixthGrade(int[] sampleStudent){
    int temp1 = 0;
    int temp2 = (int)(Math.random() * 46) + 55;

    for (int i = 0; i <= sampleStudent.length - 1; i++){
      for (int j = i + 1; j <= sampleStudent.length - 1; j++){
        if (sampleStudent[i] > sampleStudent[j]){
          temp1 = sampleStudent[i];
          sampleStudent[i] = sampleStudent[j];
          sampleStudent[j] = temp1;
        }
      }
    }

    System.out.println(Arrays.toString(sampleStudent));
    sampleStudent[0] = temp2;
    System.out.println(Arrays.toString(sampleStudent));
  }

}
