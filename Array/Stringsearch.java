import java.util.Arrays;

public class Stringsearch {
    public static void main(String[] args) {
        String name = "Prathmesh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search1(name, 'P'));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            System.out.println("String is Empty");
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;

    }

    static boolean search1(String str, char target) {
        if (str.length() == 0) {
            System.out.println("String is Empty");
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;

    }
}
