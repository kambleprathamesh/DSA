public class Ftriangle {
    static void ft(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void Ift(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(count );
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ft(5);
        System.out.println();
        Ift(5);
    }
}
