import java.util.*;

public class spiralMatrix {

    public static void matrixSpiral(int java[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = java.length - 1;
        int endCol = java[0].length - 1;

        // print spiral matrix code
        while (startRow <= endRow && startCol <= endCol) {
            // top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(java[startRow][j] + " ");
            }

            // right boundary
            for (int i = endCol + 1; i <endRow[0].length; i++) {
                System.out.print(java[i][endCol] + " ");
            }
        }
    }

    public static void main(String args[]) {
        int array[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    }
}
