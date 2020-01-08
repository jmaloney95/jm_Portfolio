import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Assign1_1 {
  public static final int MINIMUM = 1;
  public static final int MAXIMUM = 10;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int flag = 1;
    menu();
    do {
      int number = 0;
      boolean done = false;
      Scanner input = new Scanner(System.in);
      while (!done){
        System.out.print("Please enter your option: ");
        try {
          number = input.nextInt();
          if (number < 0 || number > 6){
            System.out.print("Invalid input! ");
          } else {
            done = true;
          }
        } catch (InputMismatchException e){
          System.out.print("Invalid input! ");
          input.next();
        }
      }
      switch(number){
        
        case 1: // add
          System.out.print("Enter the size of square matrices: ");
          int size = sc.nextInt();
          int [][] first = generateMatrix(size, MINIMUM, MAXIMUM);
          int [][] second = generateMatrix(size, MINIMUM, MAXIMUM);
          System.out.println("First matrix is: ");
          print(first);
          System.out.println("Second matrix is: ");
          print(second);
          System.out.println("The resulting matrix is: ");
          print(add(size, first, second));
          System.out.println("Command number " + number + " completed.");
          System.out.println();
          break;
          
        case 2: // subtract
          System.out.print("Enter the size of square matrices: ");
          int size1 = sc.nextInt();
          int [][] first1 = generateMatrix(size1, MINIMUM, MAXIMUM);
          int [][] second1 = generateMatrix(size1, MINIMUM, MAXIMUM);
          System.out.println("First matrix is: ");
          print(first1);
          System.out.println("Second matrix is: ");
          print(second1);
          System.out.println("The resulting matrix is: ");
          print(subtract(size1, first1, second1));
          System.out.println("Command number " + number + " completed.");
          System.out.println();
          break; 
          
        case 3: // multiply
          System.out.print("Enter the size of square matrices: ");
          int size3 = sc.nextInt();
          int [][] first3 = generateMatrix(size3, MINIMUM, MAXIMUM);
          int [][] second3 = generateMatrix(size3, MINIMUM, MAXIMUM);
          System.out.println("First matrix is: ");
          print(first3);
          System.out.println("Second matrix is: ");
          print(second3);
          System.out.println("The resulting matrix is: ");
          print(multiply(size3, first3, second3));
          System.out.println("Command number " + number + " completed.");
          System.out.println();
          break;
          
        case 4: // multiply by a constant
          System.out.print("Enter the size of the square matrix: ");
          int size4 = sc.nextInt();
          System.out.print("Enter the multiplication constant: ");
          int constant = sc.nextInt();
          int [][] first4 = generateMatrix(size4, MINIMUM, MAXIMUM);
          System.out.println("The matrix is: ");
          print(first4);
          System.out.println("The original matrix multiplied by " + constant + " is: ");
          print(multiplyByConstant(size4, constant, first4));
          System.out.println("Command number " + number + " completed.");
          System.out.println();
          break;
          
        case 5: // transpose
          System.out.print("Enter the size of the square matrix: ");
          int size5 = sc.nextInt();
          int [][] matrix5 = generateMatrix(size5, MINIMUM, MAXIMUM);
          System.out.println("The matrix is: ");
          print(matrix5);
          System.out.println("The transposed matrix is: ");
          print(transpose(size5, matrix5));
          System.out.println("Command number " + number + " completed.");
          System.out.println();
          break;
          
        case 6: // matrix trace
          System.out.print("Enter the size of the square matrix: ");
          int size6 = sc.nextInt();
          int [][] matrix6 = generateMatrix(size6, MINIMUM, MAXIMUM);
          System.out.println("The matrix is: ");
          print(matrix6);
          System.out.println("The trace for this matrix is: " + trace(matrix6));
          System.out.println("Command number " + number + " completed.");
          System.out.println();
          break;
          
        case 0: // exit
          System.out.println("Testing completed.");
          flag = 0;
          break;
      }
    } while (flag != 0);
    sc.close();
  }
  public static void menu(){
    System.out.print("Your options are:\n------------------");
    System.out.println("\n 1) Add 2 matrices ");
    System.out.println(" 2) Subtract 2 matrices ");
    System.out.println(" 3) Multiply 2 matrices ");
    System.out.println(" 4) Multiply matrix by constant");
    System.out.println(" 5) Transpose matrix ");
    System.out.println(" 6) Matrix trace ");
    System.out.println(" 0) EXIT ");
  }
  
  public static int[][] generateMatrix(int size, int lower, int upper) {
    Random rand = new Random();
    int[][] temp = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        temp[i][j] = rand.nextInt(upper - lower + 1) + lower;
      }
    } return temp;
  }
  
  public static int[][] add(int size, int[][] first, int [][] second) {
    int[][] temp = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        temp[i][j] = first[i][j] + second[i][j];
      }
    } return temp;
  }
  
  public static int[][] subtract(int size, int[][] first, int [][] second) {
    int[][] temp = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        temp[i][j] = first[i][j] - second[i][j];
      }
    } return temp;
  }
  
  public static int[][] multiply(int size, int[][] first, int[][] second) {
    int[][] temp = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        temp[i][j] = first[i][j] * second[i][j];
      }
    } return temp;
  }
  
  public static int[][] multiplyByConstant(int size, int constant, int[][] matrix) {
    int[][] temp = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        temp[i][j] = matrix[i][j] * constant;
      }
    } return temp;
  }
  
  public static int[][] transpose(int size, int[][] matrix) {
    int[][] temp = new int[size][size];
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        temp[i][j] = matrix[j][i];
      }
    } return temp; 
  }
  
  public static int trace(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        if (i == j){
          sum += matrix[i][j];
        }
      }
    } return sum;
  }
  
  public static void print(int[][] matrix){
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        System.out.printf("%5d", matrix[i][j]);
      } System.out.println();
    }
  }
  
}