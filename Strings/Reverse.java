public class Reverse {
    public static void main(String[] args) {
        String result = reverseString("prathmesh");
        System.out.println(result);
    }

    static String reverseString(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >=0; i--) {
            rev = rev + word.charAt(i);
        }
        return rev;
    }
}
