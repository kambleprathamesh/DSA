import java.util.*;

public class LargestSmallest {

    // find te laregst value in the array
    public static int largest(int java[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < java.length; i++) {
            for (int j = 0; j < java[0].length; j++) {
                int initial = java[i][j];

                if (initial > largest) {
                    largest = initial;
                }
            }

        }
        return largest;
    }

    // find the smallest value in the array
    public static int smallest(int java[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < java.length; i++) {
            for (int j = 0; j < java[0].length; j++) {
                int initial = java[i][j];
                if (initial < smallest) {
                    smallest = initial;
                }
            }

        }
        return smallest;
    }

    public static void main(String args[]) {
        // code to defien and scann the 2d array
        // define arry
        int Array[][] = new int[4][3];

        // defie the length of 2d array
        int n = Array.length, m = Array[0].length;

        // object scanner
        Scanner sc = new Scanner(System.in);

        // loops to tae input inthe array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Scanning Done");
        System.out.println("Output of the Array");

        // print the 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }

        // call largest function
        int largest = largest(Array);
        System.out.println("The Largest Value in the Array is " + largest);

        // call the smallest function
        int smallest = smallest(Array);
        System.out.println("The Smallest Numbetr in An Array " + smallest);
    }
}
