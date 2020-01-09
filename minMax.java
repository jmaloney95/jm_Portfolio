// **********************************************
// COSC 236                      ASSIGNMENT 2_2
// YOUR NAME: John Maloney
// DUE-DATE:3/30/17
// PROGRAM-NAME: minMax
//
//**********************************************
import java.util.Scanner;
public class minMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Min/Max problem for 3 floating-point numbers");
    System.out.println("===========================================");
    System.out.print("Do you want to start (Y/N): ");
    char start = sc.next().charAt(0);
    while (start == 'Y' || start == 'y')
    {
      System.out.print("Enter 3 float values: ");
      float v1 = sc.nextFloat();
      float v2 = sc.nextFloat();
      float v3 = sc.nextFloat();
      System.out.println("You entered " + v1 + ", " + v2 + ", " + v3);
      float smallest;
      if (v1<v2 && v1<v3){ //test for smallest number
        smallest = v1;
      }else if (v2<v1 && v2<v3){
        smallest = v2;
      }else{
        smallest = v3;
      }
      float largest;
      if (v1>v2 && v1>v3){ //test for largest number
        largest = v1;
      }else if (v2>v1 && v2>v3){
        largest = v2;
      }else{
        largest = v3;
      }
      System.out.println("Min = " + smallest);
      System.out.println("Max = " + largest);
      System.out.print("Continue? (Y/N): ");
      start = sc.next().charAt(0);
    }
    sc.close(); //close scanner
  }
}
      
             
    