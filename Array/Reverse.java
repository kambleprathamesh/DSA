import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        // Rev(arr);

        RevStr("Prathm");
    }

    static void Rev(int arr[]) {
        int length = arr.length;
        for (int i = 0; i <= length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;

        }

        // System.out.println(Arrays.toString(arr));
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    static void RevStr(String Str) {
        String RevStr = "";
        for (int i = Str.length() - 1; i >= 0; i--) {
            RevStr += Str.charAt(i);
        }

        System.out.println(RevStr);
    }
}
