import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String args[]) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elemets in the arrya");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // print array
        // System.out.println("Printing Elemets in the array method 1");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // System.out.println("Printing Elemets in the array method 2");

        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        System.out.println("Printing Elemets in the array method 3");

        System.out.print(Arrays.toString(arr));

        change(arr);
        System.out.println("Printing Elemets in the array After chnage ");

        System.out.print(Arrays.toString(arr));
    }

    static void change(int arr[]) {
        arr[0] = 99;

    }
}
