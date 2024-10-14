import java.util.*;

public class RemoveElemet {
    static void RE(int[] arr, int index) {
        int size = arr.length;
        int[] b = new int[size - 1];

        for (int i = 0; i < size; i++) {
            if (i < index) {
                b[i] = arr[i];
            } else if (i == index) {
                continue;
            } else if (i > index) {
                b[i - 1] = arr[i];
            }
        }

        // sout
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        RE(arr1, 0);
    }
}
