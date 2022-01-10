// imports
import java.util.*;

public class CoordinatePlane {
  public static void main(String[] args) {
    // instantiate a scanner object
    Scanner s = new Scanner(System.in);
    System.out.println("Which of the following do you want?");
    System.out.print("1. Distance calculatore \n2. Area calculator \n");

    int choice = s.nextInt();

    if(choice == 1){
      distance();
    }
    else{
      area();
    }//end if statement
  }// end main method

  public static void area(){
    Scanner s = new Scanner(System.in);

    System.out.println("What shpe do you want to know the area of?");
    System.out.println("1. Square");

    int choice = s .nextInt();

    if (choice == 1){
      square();
    }//end if statement
  }//end area method

  public static void square(){
    Scanner s = new Scanner(System.in);

    System.out.println("Please enter coordinates in clockwise order.");
    System.out.print("Please input 1st coordinate: ");
    String point1 = s.nextLine();

    int x1 = getX(point1);
    int y1 = getY(point1);

    System.out.print("Please input 2nd coordinate: ");
    String point2 = s.nextLine();

    int x2 = getX(point2);
    int y2 = getY(point2);

    System.out.print("Please input 3rd coordinate: ");
    String point3 = s.nextLine();

    int x3 = getX(point3);
    int y3 = getY(point3);

    System.out.print("Please input 4th coordinate: ");
    String point4 = s.nextLine();

    int x4 = getX(point4);
    int y4 = getY(point4);

    double distance1 = crowsDistance(x1, y1, x2, y2);
    double distance2 = crowsDistance(x2, y2, x3, y3);
    double distance3 = crowsDistance(x3, y3, x4, y4);
    double distance4 = crowsDistance(x4, y4, x1, y4);

    if (distance1 == distance2 && distance2 == distance3 && distance3 == distance4) {
      System.out.println("Passes distance test.");
    }
      else {
      System.out.println("Fails ditance test, it's not a square.");
    }

    double slope1 = slope(x1, y1, x2, y2);
    double slope2 = slope(x2, y2, x3, y3);
  }


  public static double slope(double x1, double y1, double x2, double y2){

    if (x1 != x2){
      return (y2 - y1) / (x2 - x1);
    }

    return 0.0;
  }


  public static void distance() {
    Scanner s = new Scanner(System.in);

    System.out.print("please input a coordinate: ");
    String point1 = s.nextLine();

    int x1 = getX(point1);
    int y1 = getY(point1);

    System.out.print("please input another coordinate: ");
    String point2 = s.nextLine();

    int x2 = getX(point2);
    int y2 = getY(point2);

    double distance1 = crowsDistance(x1, y1, x2, y2);
    double distance2 = taxicabDistance(x1, y1, x2, y2);
    System.out.println("The crow's distance between the two points is: " + distance1);
    System.out.println("The taxicab distance between the two points is: " + distance2);
  }


  /*
   * Name: getX
   * Purpose: extract the x-value from a point
              convert the String to an int
   * Input: String coordinate pair (input from main)
   * Return: the x-value (int)
  */
  public static int getX(String point) {
    int commaPos = point.indexOf(",");
    // get the String version of x
    String xVal = point.substring(1, commaPos);

    // convert that String to an int
    int x = Integer.parseInt(xVal);

    // send the info back to main
    return x;
  }

  public static int getY(String point) {
    int commaPos = point.indexOf(",");
    // get the String version of y
    String yVal = point.substring(commaPos + 2, point.length() - 1);

    // convert that String to an int
    int y = Integer.parseInt(yVal);

    // send the info back to main
    return y;
  }

  public static double crowsDistance(int x1, int y1, int x2, int y2) {
    // distance formula = sqrt[(y2 - y1)^2 + (x2 - x1)^2]
    int deltaX = x2 - x1;
    int deltaY = y2 - y1;

    // distance formula = sqrt[(deltaY)^2 + (deltaX)^2]
    int deltaXsquared = deltaX * deltaX;
    int deltaYsquared = deltaY * deltaY;

    // distance formula = sqrt[(deltaYsquared + deltaXsquared]
    int sum = deltaYsquared + deltaXsquared;

    // distance formula = sqrt[sum]
    double distance1 = Math.sqrt(sum);

    return distance1;
    }// end crowsDistance method

  public static double taxicabDistance(int x1, int y1, int x2, int y2) {
    // distance forumla = |y2 - y1| + |x2 - x1|
    double distance2 = Math.abs(y2 - y1) + Math.abs(x2 - x1);

    return distance2;
  }
}// end class
