public class SolidRhombus {
    static void SR(int n) {
        // no of rows
        for (int i = 1; i <= n; i++) {
            // space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        SR(5);
    }
}
