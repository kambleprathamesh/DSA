public class Pattern3 {
    public static void main(String[] args) {
        Pattern28(5);
    }

    // pattern1
    // ******* /
    // ****** /
    // ****
    // ***
    // **
    // *

    // static void pattern1(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <=n - row+1; col++)
    // System.out.print("*");

    // System.out.println();
    // }
    // }

    // pattern2
    // *
    // **
    // ***
    // ****
    // ******
    // ****
    // ***
    // **
    // *

    // static void Pattern2(int n) {
    // for (int row = 0; row <= 2 * n; row++) {
    // int totalCols = row > n ? 2 * n - row : row;
    // for (int col = 0; col <= totalCols; col++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }
    // }

    static void Pattern28(int n) {
        for (int row = 0; row <2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalCols;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
