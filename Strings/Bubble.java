import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        // int[] str = { 77, 33, -1, 98, -99, 2, 3, 4, 100 };
        String str1 = "SILENT";
        String str2 = "LISTEN";
        boolean result = Anagram(str1, str2);
        System.out.println("The String is: " + result);

    }

    static boolean Anagram(String str1, String str2) {
        // check thyhe length of string
        if (str1.length() != str2.length()) {
            return false;
        }

        // if length match convert string to array
        // char[] str1=str1.toLowerCase().toCharArray()
        char[] word1 = str1.toLowerCase().toCharArray();
        char[] word2 = str2.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(word2));

        // sort the charArray so cvalled the bubble sort
        bubble(word1);
        bubble(word2);
        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(word2));

        // now compare after sorting
        for (int i = 0; i < word1.length; i++) {
            if (word1[i] != word2[i]) {
                return false;
            }
        }
        return true;

    }

    static void bubble(char[] str) {
        for (int i = 0; i < str.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < str.length - i; j++) {
                // check if arr[j]<arr[j-1] and swap if required
                if (str[j] < str[j - 1]) {
                    char temp = str[j];
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
