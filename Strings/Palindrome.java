public class Palindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome("prathm");
        System.out.println(result);
    }

    static boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
