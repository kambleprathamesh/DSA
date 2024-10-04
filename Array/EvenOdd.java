public class EvenOdd {
    public static void main(String[] args) {
        int nums[] = { 8, 9, 7, 2,1 };
        checkEvenOdd(nums);
    }

    static void checkEvenOdd(int[] nums) {
        int evenCount = 0, oddCount = 0;
        // int[] evenarr = new int[nums.length];
        // int[] oddarr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // check for even
            if ((nums[i] % 2) == 0) {

                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount + " & " + "Odd Count: " + oddCount);
    }
}
