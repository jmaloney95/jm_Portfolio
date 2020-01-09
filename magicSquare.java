import java.util.InputMismatchException;
import java.util.Scanner;
public class magicSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = -1;
    char yesOrNo;
 
    do {
      boolean done = false;
      while (!done) {
        System.out.print("Enter the size of magic square (positive & odd): ");
        try {
          size = sc.nextInt();
          if (size < 0 || size % 2 == 0) {
            System.out.print("Input error - negative number/not positive or odd! ");
          } else {
            done = true;
          }
        } catch (InputMismatchException e) {
          System.out.print("Input error - negative number/not positive or odd! ");
          sc.next();
        }
      }
      int[][] magic = new int[size][size];
      magic[0][magic.length / 2] = 1;
      int total = size*size;
      
      System.out.println("The magic square with size " + size + " is: ");
      print(magic);
      System.out.print("The " + size + "x" + size + " magic square adds up to " + magicSquareSum(size) + "\n");
      System.out.print("Do you want to continue (Y/N): ");
      yesOrNo = sc.next().charAt(0);
    } while (yesOrNo == 'Y' || yesOrNo == 'y');
    sc.close();
  }
  
  public static void magicSquare(int[][] matrix){
    matrix[0][matrix.length / 2] = 1;
    
  }
  
  public static int magicSquareSum(int n) {
    return ((n * (n * n + 1)) / 2);
  }
  
  public static void print(int[][] square) {
    for (int i = 0; i < square.length; i++) {
      for (int j = 0; j < square[i].length; j++) {
        System.out.printf("%5d", square[i][j]);
      }
      System.out.println();
    }
  }
  
}
