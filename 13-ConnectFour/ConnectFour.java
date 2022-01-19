import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7];

    fillBoard(board);

    boolean result = false;
    while (result != true){
      displayBoard(board);
      player1(board);

      displayBoard(board);
      player2(board);

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
    System.out.println("\033[H\033[2J"); 
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }

  public static void player1 (String[][] board){
    Scanner s = new Scanner(System.in);

    int x1 = 0;
    System.out.println("Player 1 drop your piece at: ");
    x1 = s.nextInt();
    if (board[0][x1 - 1] != "[ ]"){
      System.out.println("Invalid entry, please drop your piece at another column: ");
      x1 = s.nextInt();
      pieceDrop1(board, x1 - 1);
    }
    else
      pieceDrop1(board, x1 - 1);
  }

  public static void player2 (String[][] board){
    Scanner s = new Scanner(System.in);

    int x2 = 0;
    System.out.println("Player 2 drop your piece at: ");
    x2 = s.nextInt();
    if (board[0][x2 - 1] != "[ ]"){
      System.out.println("Invalid entry, please drop your piece at another column: ");
      x2 = s.nextInt();
      pieceDrop2(board, x2 - 1);
    }
    else
      pieceDrop2(board, x2 - 1);
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
