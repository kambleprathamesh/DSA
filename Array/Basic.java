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
        System.out.println("Printing Elemets in the array");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
