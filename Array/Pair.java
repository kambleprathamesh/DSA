public class Pair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        pr(arr);
    }

    static void pr(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("( " + arr[i] + " , " + arr[j] + " )");
            }
            System.out.println();
        }
    }
}
