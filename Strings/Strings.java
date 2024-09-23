import java.util.*;

public class Strings {

    // CharAt()
    // public static void printLine(String str) {
    // for (int i = 0; i < str.length(); i++) {
    // System.out.print(str.charAt((i)) + " " + i + " ");
    // }
    // System.out.println(" ");
    // }

    // palindrome question
    // public static Boolean palindrome(String str) {
    // int j = str.length();
    // for (int i = 0; i <= str.length() / 2; i++) {
    // if (str.charAt(i) == str.charAt(j - 1)) {
    // j--;
    // } else {
    // return false;
    // }
    // }
    // return true;
    // }

    // direction questions
    // public static void shortPath(String distance) {
    // int y = 0, x = 0;
    // for (int i = 0; i < distance.length(); i++) {
    // if (distance.charAt(i) == 'n' || distance.charAt(i) == 'N') {
    // y++;
    // } else if (distance.charAt(i) == 's' || distance.charAt(i) == 'S') {
    // y--;
    // } else if (distance.charAt(i) == 'e' || distance.charAt(i) == 'E') {
    // x--;
    // } else if (distance.charAt(i) == 'w' || distance.charAt(i) == 'W') {
    // x++;
    // }
    // }
    // int x2 = x * x;
    // int y2 = y * y;
    // int shortPath = (int)(Math.sqrt(x2 + y2));
    // System.out.println("Shortest Path " + shortPath);
    // }

    // substring
    // public static String subString(String str, int s, int e) {
    // String substring = "";
    // if (str.length() < e) {
    // return "String length less";
    // }
    // for (int i = s; i < e; i++) {
    // substring += str.charAt(i);
    // }
    // return substring;
    // }

    // lexicography
    // public static void largestSring(String fruits[]) {
    // String largest = fruits[0];
    // for (int i = 0; i < fruits.length; i++) {
    // if (largest.compareToIgnoreCase(fruits[i]) < 0) {
    // largest = fruits[i];
    // }
    // }
    // System.out.print("largest Fruit is " + largest);
    // }

    // string compression
    // public static String compress(String str) {
    // StringBuilder sb = new StringBuilder("");
    // for (int i = 0; i < str.length(); i++) {
    // Integer count = 1;
    // while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    // count++;
    // i++;
    // }
    // sb.append(str.charAt(i));
    // if (count > 1) {
    // sb.append(count.toString());
    // }
    // }
    // return sb.toString();
    // }

    // string to uppercase
    public static String toUpperCase(String str) {
        // hii, my name is prathmesh
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                ch = Character.toUpperCase(str.charAt(i + 1));
                sb.append(ch);
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        // System.out.println("Enter String Below");
        // Scanner sc = new Scanner(System.in);

        // concatnate
        // String firstName = sc.nextLine();
        // String lastName = new String("Kamble");
        // String finalName = firstName + " " + lastName;
        // System.out.println(finalName);
        // System.out.println(finalName.charAt(0));

        // prinline
        // String str = "Prathmesh Kamble";
        // printLine(str);

        // check palindrome
        // String str = "rcar";
        // Boolean result = palindrome(str);
        // if (result == true) {
        // System.out.println("String is Palindrom");
        // } else {
        // System.out.println("String is not Palindrom");
        // }

        // shortPath("WNEENESENNN");

        // subString
        // System.out.println("The Substring is " + subString("Prathmesh", 3, 6));

        // lexicography
        // String fruits[] = { "sitafal", "Apple", "Mango", "Banana", "Peru", };
        // largestSring(fruits);

        // string compression
        // String str = "aaaabbbccd";
        // System.out.println(compress(str));

        // string to uppercase

        String str = "hii, my name is prathmesh";
        System.out.println(toUpperCase(str));
    }
}