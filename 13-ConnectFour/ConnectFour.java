import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7];

    fillBoard(board);
    displayBoard(board);

    boolean result = false;
    int round = 0;
    while (result != true){
      round++;
      player(board, round);
      displayBoard(board);
      if (result(board).equals("Player 1 win!") || result(board).equals("Player 2 win!")){
        System.out.println(result(board));
        System.out.println("Thanks for playing!");
        System.out.println();
        break;
      }

      round++;
      player(board, round);
      displayBoard(board);
      if (result(board).equals("Player 1 win!") || result(board).equals("Player 2 win!")){
        System.out.println(result(board));
        System.out.println("Thanks for playing!");
        System.out.println();
        break;
      }
    }

  }

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

  public static void player (String[][] board, int y){
    Scanner s = new Scanner(System.in);

    if (y%2 == 1){

      int x1 = 0;

      // ask the user for a column
      System.out.println("Player 1 drop your piece at: ");
      x1 = s.nextInt();

      // if that entry is invalid, then ask again...
      // and ask again until the entry is valid
      // invalid means the column value is too large or the columm is filled up
      while (x1 > board[0].length || board[0][x1 - 1] != "[ ]") {
        System.out.println("Invalid entry, please drop your piece at another column: ");
        x1 = s.nextInt();
      }

      // once the while loop breaks, we know the user has entered a valid column
      // so play the round
      pieceDrop(board, x1 - 1, y);
    }

    if (y%2 == 0){

      int x2 = 0;

      System.out.println("Player 2 drop your piece at: ");
      x2 = s.nextInt();

      while (x2 > board[0].length || board[0][x2 - 1] != "[ ]") {
        System.out.println("Invalid entry, please drop your piece at another column: ");
        x2 = s.nextInt();
      }

      pieceDrop(board, x2 - 1, y);
    }

  }

  public static String[][] pieceDrop (String[][] board, int x, int y) {
    for (int i = board.length - 1; i >= 0; i--){
      if (board[i][x] == "[ ]"){
        if (y%2 == 1)
          board[i][x] = "[x]";
        if (y%2 == 0)
          board[i][x] = "[o]";
        break;
      }
    }
    return board;
  }

  public static String result (String[][] board) {

    String result;
    if (connectHor1(board) == true || connectVer1(board) == true || connectDia1(board) == true) {
      result = "Player 1 win!";
      return result;
    }

    if (connectHor2(board) == true || connectVer2(board) == true || connectDia2(board) == true) {
      result = "Player 2 win!";
      return result;
    }

    return "";
  }

  public static boolean connectHor1 (String[][] board) {
    boolean connect = false;
    for (int i = board.length - 1; i >= 0; i--) {
      for (int j = 0; j < 4; j++){
        if (board[i][j].equals(board[i][j + 1]) && board[i][j + 1].equals(board[i][j + 2]) && board[i][j + 2].equals(board[i][j + 3]) && board[i][j + 3].equals("[x]"))
        connect = true;
      }
    }
    return connect;
  }

  public static boolean connectHor2 (String[][] board) {
    boolean connect = false;
    for (int i = board.length - 1; i >= 0; i--) {
      for (int j = 0; j < 4; j++){
        if (board[i][j].equals(board[i][j + 1]) && board[i][j + 1].equals(board[i][j + 2]) && board[i][j + 2].equals(board[i][j + 3]) && board[i][j + 3].equals("[o]"))
        connect = true;
      }
    }
    return connect;
  }

  public static boolean connectVer1 (String[][] board) {
    boolean connect = false;
    for (int j = 0; j < board[0].length - 1; j++) {
      for (int i = board.length - 1; i >= 3; i--)
      if (board[i][j].equals(board[i - 1][j]) && board[i - 1][j].equals(board[i - 2][j]) && board[i - 2][j].equals(board[i - 3][j]) && board[i - 3][j].equals("[x]"))
        connect = true;
    }
    return connect;
  }

  public static boolean connectVer2 (String[][] board) {
    boolean connect = false;
    for (int j = 0; j < board[0].length - 1; j++) {
      for (int i = board.length - 1; i >= 3; i--) {
        if (board[i][j].equals(board[i - 1][j]) && board[i - 1][j].equals(board[i - 2][j]) && board[i - 2][j].equals(board[i - 3][j]) && board[i - 3][j].equals("[o]"))
        connect = true;
      }
    }
    return connect;
  }

  public static boolean connectDia1 (String[][] board) {
    boolean connect = false;
    for (int i = board.length - 1; i >= 3; i--) {
      for (int j = 3; j < board[i].length; j++){
        if (board[i][j].equals(board[i - 1][j - 1]) && board[i - 1][j - 1].equals(board[i - 2][j - 2]) && board[i - 2][j - 2].equals(board[i - 3][j - 3]) && board[i - 2][j - 2].equals("[x]"))
        connect = true;
      }
    }
    for (int i = board.length - 1; i >= 3; i--) {
      for (int j = board[i].length - 4; j >= 0; j--){
        if (board[i][j].equals(board[i - 1][j + 1]) && board[i - 1][j + 1].equals(board[i - 2][j + 2]) && board[i - 2][j + 2].equals(board[i - 3][j + 3]) && board[i - 3][j + 3].equals("[x]"))
        connect = true;
      }
    }
    return connect;
  }

  public static boolean connectDia2 (String[][] board) {
    boolean connect = false;
    for (int i = board.length - 1; i >= 3; i--) {
      for (int j = 3; j < board[i].length; j++){
        if (board[i][j].equals(board[i - 1][j - 1]) && board[i - 1][j - 1].equals(board[i - 2][j - 2]) && board[i - 2][j - 2].equals(board[i - 3][j - 3]) && board[i - 2][j - 2].equals("[o]"))
        connect = true;
      }
    }
    for (int i = board.length - 1; i >= 3; i--) {
      for (int j = board[i].length - 4; j >= 0; j--){
        if (board[i][j].equals(board[i - 1][j + 1]) && board[i - 1][j + 1].equals(board[i - 2][j + 2]) && board[i - 2][j + 2].equals(board[i - 3][j + 3]) && board[i - 3][j + 3].equals("[o]"))
        connect = true;
      }
    }
    return connect;
  }

} // end class
