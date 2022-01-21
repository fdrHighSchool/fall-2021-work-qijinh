import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7];

    fillBoard(board);
    displayBoard(board);

    boolean result = false;
    while (result != true){
      player1(board);
      displayBoard(board);
      if (result(board).equals("Player 1 win!") || result(board).equals("Player 2 win!")){
        System.out.println(result(board));
        System.out.println("Thanks for playing!");
        System.out.println();
        break;
      }
      player2(board);
      displayBoard(board);
      if (result(board).equals("Player 1 win!") || result(board).equals("Player 2 win!")){
        System.out.println(result(board));
        System.out.println("Thanks for playing!");
        System.out.println();
        break;
      }
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
