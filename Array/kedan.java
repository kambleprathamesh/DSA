public class kedan {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        KP(numbers);
    }

    static void KP(int[] arr) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        double result = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
            if (sum < 0) {

            }
            result = Math.pow(sum, largest);
        }
        System.out.println("The max Sub Array " + sum);
    }
}
