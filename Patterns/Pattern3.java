public class Pattern3 {
    public static void main(String[] args) {
        pattern2(5);
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

    static void pattern2(int n) {
        for (int row = 1; row < 2 * n; row++) {
            if (row > n) {
                for (int col = 1; col <= n - (row - n); col++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int col = 0; col <=row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
