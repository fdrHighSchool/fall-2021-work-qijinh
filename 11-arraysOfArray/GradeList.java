import java.util.*;

public class GradeList {

  public static void main (String[] args) {

    int[][] gradeList = new int[15][5];

    for (int i = 0; i < gradeList.length; i++) {
      for (int j = 0 ; j < gradeList[i].length; j++){
        gradeList[i][j] = (int)(Math.random() * 46) + 55;
      }
    }

    for(int[] grades : gradeList) {
      for(int grade : grades) {
          System.out.print(grade + " ");
      }
      System.out.println();
    }

  }

}
