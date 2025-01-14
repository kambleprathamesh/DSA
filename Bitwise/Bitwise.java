public class Bitwise {

    static boolean isOdd(int n) {
        if (n == 1) {
            System.out.println("Dont know");
            return false;
        }
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        boolean ans = isOdd(2);
        System.out.println(ans);
    }
}
