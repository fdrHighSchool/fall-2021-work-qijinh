import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7];

    fillBoard(board);

    boolean result = false;
    int x1 = 0, x2 = 0;
    while (result != true){
      displayBoard(board);
      System.out.println("Player 1 drop your piece at: ");
      x1 = s.nextInt();
      pieceDrop1(board, x1 - 1);
      displayBoard(board);
      System.out.println();

      System.out.println("Player 2 drop your piece at: ");
      x2 = s.nextInt();
      pieceDrop2(board, x2 - 1);
      displayBoard(board);
      System.out.println();

    }
  } // end main method

  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      }
    }
  }

  public static void displayBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }


  public static String[][] pieceDrop1 (String[][] board, int x) {
    for (int i = board.length - 1; i >= 0; i--){
      if (board[i][x] == "[ ]"){
        board[i][x] = "[x]";
        break;
      }
    }
    return board;
  }

  public static String[][] pieceDrop2 (String[][] board, int x) {
    for (int i = board.length - 1; i >= 0; i--){
      if (board[i][x] == "[ ]"){
        board[i][x] = "[o]";
        break;
      }
    }
    return board;
  }

} // end class
