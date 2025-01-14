public class Bitwise {

    static boolean isOdd(int n) {
        if (n == 1) {
            System.out.println("Dont know");
            return false;
        }
        return (n & 1) == 1;
    }

    static int isUnique(int arr[]) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;

    }

    static int ithDigit(int n, int i) {
        return n & 1 << (i - 1);
    }

    static int setBit(int n, int i) {
        return n | 1 << (i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 67677, 67677, 6, 2, 3 };
        int ans = setBit(86, 4);
        System.out.println(ans);
    }
}
