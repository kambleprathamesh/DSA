public class ButterFly {

    static void ButtP(int size) {
        // first half
        for (int i = 1; i <= size; i++) {

            // first start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int space = 1; space <= 2 * (size - i); space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i = 1; i <= size; i++) {

            // first start
            for (int j = 1; j <= size - i+1; j++) {
                System.out.print("*");
            }

            for (int space = 1; space <= 2 * (i - 1); space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ButtP(4);
    }
}
