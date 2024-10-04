public class Reverse {
    public static void main(String[] args) {
        ReverseNum(123456789);
    }

    static void ReverseNum(int num) {

        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem + " ");
            num = num / 10;
        }

    }
}
