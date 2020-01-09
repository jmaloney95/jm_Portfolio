// **********************************************
// COSC 236                      ASSIGNMENT 2_1
// YOUR NAME: John Maloney
// PROGRAM-NAME: howMany
//
//**********************************************
import java.util.Scanner;
public class howMany {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many numbers in input? ");
    int howMany = sc.nextInt();
    int counter = 0;
    if (howMany <= 0) {
      System.out.print("ERROR! Should be positive. REENTER: "); //input validation
      howMany = sc.nextInt();
    }
    while (counter <= howMany) {
      System.out.print("Enter a pair of positive integers: ");
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      if (n1 <= 0 || n2 <= 0) {
        System.out.print("ERROR! Both should be positive. REENTER: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
      }
      if (n1 % n2 == 0) { //test
        System.out.println(n1 + " is a multiple of " + n2);
        System.out.println();
      }
      else{
        System.out.println(n1 + " is NOT a multiple of " + n2);
        System.out.println();
      }
      counter++;
    }
    sc.close(); //close scanner
  }
}
