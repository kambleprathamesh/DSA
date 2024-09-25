import java.util.*;

public class TwoDArray {
    public static void main(String args[]) {
        // syntax
        // Not necessary to declaree the number of columns
        // int arr[][] = new int[3][3];
        // System.out.println("Enter Elements in the 2D Array");
        Scanner in = new Scanner(System.in);
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // arr[row][col] = in.nextInt();
        // }
        // }

        // System.out.println(Arrays.toString(arr));
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // System.out.println(Arrays.toString(arr[row]));
        // for (int[] ele : arr) {
        // System.out.println(Arrays.toString(ele));
        // }

        // nocolumn fixed
        // int[][] arr1 = {
        // { 1, 2, 3, 4 },
        // { 5, 6 },
        // { 7, 8, 9 }

        // };

        // print this arr1
        // for (int row = 0; row < arr1.length; row++) {
        // for (int col = 0; col < arr1[row].length; col++) {
        // System.out.print(arr1[row][col] + " ");
        // }
        // System.out.println("");
        // }

        // for (int[] arr : arr1) {
        // System.out.println(Arrays.toString(arr));
        // }

        int arr[] = new int[3];

        for (int row = 0; row < arr.length; row++) {

            arr[row] = in.nextInt();

        }

        // print ther array
        for (int ele : arr) {
            System.out.println(Arrays.toString(arr));
            // System.out.print(ele + " ");
        }
    }

}
