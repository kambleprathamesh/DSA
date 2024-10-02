public class Ceilvalue {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int arr[] = { 6, 5, 4, 3, 2, 1 };
        int number = FloorValue(arr, 10);
        System.out.println(number);
    }

    static int Ceilvalue1(int[] arr, int key) {
        // apply binary search

        int start = 0;
        int end = arr.length - 1;
        // step1-find mid

        // compare key and target
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("key Found at Index : " + mid);
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            // accordingly increase/decrease the Value
        }
        return start;
    }

    static int FloorValue(int[] arr, int key) {
        // declare the varaible
        // finf the middle
        // compare
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("key Found at Index : " + mid);
                return arr[end];
            }

        }
        return end;
    }

}
