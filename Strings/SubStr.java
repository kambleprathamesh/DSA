public class SubStr {
    public static void main(String[] args) {
        String name = "Prathmesh";
        String subString = "mesh";
        boolean result = CS(name, subString);
        System.out.println(result);
    }

    static boolean CS(String str, String SubStr) {
        if (str.length() > SubStr.length()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == SubStr.charAt(i)) {
                    for (int j = i; j < SubStr.length(); j++) {
                        if (str.charAt(j) != SubStr.charAt(j)) {
                            return false;
                        }
                    }
                }

            }
            return true;
        }
        return false;
    }
}
