import java.util.*;

public class GradeList {

  public static void main (String[] args) {

    Scanner s = new Scanner(System.in);
    int[][] gradeList = new int[15][5];

    for (int[] grades : gradeList){
      for (int grade : grades){
        grade = (int)(Math.random() * 46) + 55;
        System.out.print(grade + " ");
      }
      System.out.println();
    }

  }

}
