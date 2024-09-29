import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 9, 7 };
        int[][] arr1 = {
                { 5, 4, 8 },
                { 9, 566, 6 },
                { 10, 100, 7 }
        };
        // System.out.println(minTDArray(arr1));
        // searchTDArray(arr1, 100);
        int[] ans = searchTDArray(arr1, 566);
        System.out.println(Arrays.toString(ans));

    }

    static int minArray(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int minTDArray(int[][] arr) {
        int min = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (min > arr[row][col]) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

    static int[] searchTDArray(int[][] arr, int key) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (key == arr[row][col]) {
                    // System.out.println(key + " Found at " + "[" + row + "," + col + "]");
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // find maximum in two d array
    static int maxTDArray(int[][] arr) {
        int max = arr[0][0];
        for (int[] array : arr) {
            for (int ele : array) {
                if (max < ele) {
                    max = ele;
                }
            }
        }
        return max;
    }
}
