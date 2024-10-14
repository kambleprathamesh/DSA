import java.util.*;

public class Sort {

    static void Sort(char[] str) {
        boolean swaped = false;
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length - i; j++) {
                if (str[j] < str[j - 1]) {
                    // swap
                    char temp = str[j];
                    str[j] = str[j - 1];
                    str[j - 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }

        System.out.println(Arrays.toString(str));

    }

    public static void main(String[] args) {
        char[] str = { 'a', 'm', 'x', 'c', 'b' };
        Sort(str);
    }
}
