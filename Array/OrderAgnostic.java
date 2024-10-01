public class OrderAgnostic {
    public static void main(String[] args) {
        // boolean isAsc;
        // int[] arr = { 11, 15, 16, 17, 18, 20 };
        int[] arr1 = { 20, 18, 17, 16, 15, 11 };

        System.out.println(SearchBS(arr1, 20));
        // find key on basis of ascending or descending

    }

    static int SearchBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        // code for order Agnostic which means find element depending on array sorted

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // ascending
            if (isAsc(arr)) {
                if (arr[mid] == target)
                    return mid;

                if (arr[mid] > target) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            } // or descending
            else {
                if (arr[mid] == target)
                    return mid;
                if (arr[mid] < target) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;

    }

    static boolean isAsc(int[] arr) {
        if (arr[0] < arr[arr.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

}
