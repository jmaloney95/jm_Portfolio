// **********************************************
// COSC 236                      ASSIGNMENT 2_4
// YOUR NAME: John Maloney
// PROGRAM-NAME: boxes
// **********************************************
import java.util.Scanner;
public class boxes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Do you want to start?(Y/N)? ");
    char start = sc.next().charAt(0);
    while (start == 'y' || start == 'Y')
    {
      System.out.print("How many rows/columns (5-21)? ");
      int rows = sc.nextInt();
      int columns = rows;
      if (rows < 5 || rows > 21) //test
      {
        System.out.println("Out of range. Reenter: "); //input validation
        rows = sc.nextInt();
        System.out.println();
      }
      for (int i=1; i<=rows; i++){
        for (int j=1; j<=columns; j++){
          if (j==i) //condition for 0's
            System.out.print("0");
          else 
            System.out.print("*");
          }
        System.out.println(" ");
        }
      System.out.print("Do you want to continue? ");
      start = sc.next().charAt(0);
    }//close while
  }//close main
}//close class
