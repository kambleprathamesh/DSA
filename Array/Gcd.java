public class Gcd {
    static void GCD(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + a + " & " + b + " is " + gcd);
    }

    public static void main(String[] args) {
        GCD(2000, 1000);
    }
}
