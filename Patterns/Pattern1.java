public class Pattern1 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 0; row <n; row++) {

            for (int col = 0; col <n-row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
