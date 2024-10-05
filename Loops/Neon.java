// package Loops;

public class Neon {
    public static void main(String[] args) {
        boolean result = isNeon(20);
        System.out.println(result);
    }

    static boolean isNeon(int num) {
        int sqaure = num * num;
        int sum = 0;
        while (sqaure > 0) {
            int rem = sqaure % 10;
            sum += rem;
            sqaure = sqaure / 10;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
