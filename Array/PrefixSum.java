public class PrefixSum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int max = MS(numbers);
        System.out.println("Max Sum " + max);
    }

    static int MS(int numbers[]) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        int[] prefix = new int[numbers.length];
        // claculate prefix values
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // cacluet ecah subarry sum using the prefix array
        for (int i = 0; i < prefix.length - 1; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;
                sum = i == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.print(sum + " ");
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
