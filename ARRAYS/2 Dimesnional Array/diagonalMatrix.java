import java.util.*;

public class diagonalMatrix {

    // brute force method time complexity o(n^2)
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // primary daigonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // secondary diagonal
                else if (i + j == matrix.length - 1) {
                    if (i != j) {
                        sum += matrix[i][j];
                    }
                }
            }
        }
        return sum;
    }

    // optimised method time complexity o(n)
    public static int diagonalSum2(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i <= matrix[0].length - 1; i++) {

            // primary diagonal
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
                // { 1, 2, 3 },
                // { 4, 5, 6 },
                // { 7, 8, 9 }
        };

        int sum = diagonalSum2(matrix);
        System.out.println("Sum of Diagonal Elemnts is " + sum);
    }
}
