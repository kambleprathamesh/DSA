import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] str = { 77, 33, -1, 98, -99, 2, 3, 4, 100 };
        bubble(str);
        System.out.println(Arrays.toString(str));
    }

    static void bubble(int[] str) {

        for (int i = 0; i < str.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < str.length - i; j++) {
                // check if arr[j]<arr[j-1] and swap if required
                if (str[j] < str[j - 1]) {
                    int temp = str[j];
                    str[j] = str[j - 1];
                    str[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }

    }
}
