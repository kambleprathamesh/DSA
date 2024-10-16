public class MaxSS {
    public static void main(String[] args) {
        int[] arr = { 34, 67, 12, 89, 45 };
        int sum = sum(arr);
        System.out.println("The Maximum Sub Array is " + sum);
    }

    static int sum(int[] arr) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("]");
                System.out.print(" = " + sum + " ");
                if (sum > largest) {
                    largest = sum;
                    sum = 0;
                }
                sum = 0;
            }
            System.out.println();

        }
        return largest;
    }
}
