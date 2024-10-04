import java.util.Arrays;

public class StrArray {
    public static void main(String[] args) {
        String str = "prathmesh";
        StrToArray(str);
    }

    // convert string to array
    static void StrToArray(String str) {
        // define array
        char[] word = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            word[i] = str.charAt(i);
            System.out.println(str.charAt(i));
        }

        // print word
        System.out.println(Arrays.toString(word));

    }
}
