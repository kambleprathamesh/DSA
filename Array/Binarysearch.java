public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 100, 3, 5, 6, 9 };
        int index = BinarySearch(arr, 100);
        System.out.println("Index " + index);
    }

    static int BinarySearch(int[] arr, int key) {
        int mid;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find mid
            mid = start + (end - start) / 2;

            // compare mid
            if (arr[mid] == key) {
                return mid;
            }
            // key<mid end=mid-1
            else if (arr[mid] > key) {
                end = mid - 1;
            }
            // if key>mid start=mid+1
            else {
                start = mid + 1;
            }

        }

        return -1;
    }
}
