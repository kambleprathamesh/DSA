public class Pattern2 {
    public static void main(String[] args) {
        pattern(7);
    }

    static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int col = 1; col <= i; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
