public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 9, 7 };
        int[][] arr1 = {
                { 5, 4, 8 },
                { 9, 566, 6 },
                { 10, 100, 7 }
        };
        System.out.println(minTDArray(arr1));
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
}
