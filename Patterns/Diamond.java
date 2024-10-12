public class Diamond {
    static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // SECONFD HALF
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
