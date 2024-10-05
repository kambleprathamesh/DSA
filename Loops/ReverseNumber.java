
public class ReverseNumber {
    public static void main(String[] args) {
        reverseNum(123456789);
    }

    static void reverseNum(int num) {
        int rev = 0;
        // find the last digit

        while (num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
