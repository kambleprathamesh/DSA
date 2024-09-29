public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 59, 100 };
        int result = searchKey1(arr, 0);
        System.out.println(result);
    }

    static int searchKey(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        // search the arry for the key
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }

        return -1;
    }

    // return the element
    static int searchKey1(int[] arr, int key) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int ele : arr) {
            if (ele == key) {
                return ele;
            }
        }
        return Integer.MIN_VALUE;
    }
}
