import java.util.*;

public class Matrices {

  // code to search an elemt in the 2d array

  public static boolean search(int java[][], int key) {
    // outside loop for row
    // inner loop for column
    // int n = java.length, m = java[0].length;
    for (int i = 0; i < java.length; i++) {
      for (int j = 0; j < java[0].length; j++) {
        if (java[i][j] == key) {
          System.out.print("Key found at cell no ( " + i + "," + j + ")");
          return true;
        }
      }

    }
    System.out.print("Key not present");
    return false;
  }

  public static void main(String args[]) {

    // define a 2d matrix
    int Matrix[][] = new int[4][5];
    int n = Matrix.length, m = Matrix[0].length;

    // craete an scanner object
    Scanner sc = new Scanner(System.in);

    // code for scxanning elemnts into a 2d array
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        Matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Scanning is Done");

    System.out.println("Following is the output of 2D Array");
    // code to print the 2d array elemnts
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(Matrix[i][j] + " ");
      }

      System.out.println();
    }

    // call the search function
    search( Matrix,9);

  }
}