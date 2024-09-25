import java.util.*;

public class Swap {
    // public static void main(String args[]) {
    // int arr[] = { 1, 2, 3, 4, 5 };
    // System.out.println(Arrays.toString(arr));

    // Swap(arr, 0, 4);
    // System.out.println(Arrays.toString(arr));

    // }

    // static void Swap(int arr[], int index1, int index2) {
    // int temp = arr[index1];
    // arr[index1] = arr[index2];
    // arr[index2] = temp;
    // }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            List.add(new ArrayList<>());
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                List.get(i).add(sc.nextInt());
            }
        }

        System.out.println(List);

    }

}
