public class LCM {
    static void Lcm(int a, int b) {
        int product = a * b;
        int gcd = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int lcm = product / gcd;
        System.out.println("LCM of the given numbers is " + lcm);
    }

    public static void main(String[] args) {
        Lcm(50, 60);
    }
}
