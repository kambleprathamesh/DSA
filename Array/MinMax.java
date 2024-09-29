public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 9, 7 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        return min;
    }

}
