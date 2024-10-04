import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    // check prime or not
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // check if te number is divisible by i and if divisble then return false
            int rem = num % i;
            if (rem == 0) {
                return false;
            }
        }
        return true;
    }
}
