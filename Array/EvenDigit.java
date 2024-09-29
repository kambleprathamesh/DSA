
public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = { 2, 41, 600, 8888, 90 };
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int digits = 0;
        int evenNum = num;
        while (num > 0) {
            num = num / 10;
            digits++;

        }
        int rem = digits % 2;
        if (rem == 0) {
            System.out.println("Number is even " + evenNum);
            return true;
        }
        return false;
    }
}
