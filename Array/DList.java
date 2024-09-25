import java.util.ArrayList;
import java.util.Scanner;

public class DList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(in.nextInt());

        }

        System.out.println(list);
        // list.add(0, 77);
        // list.set(0, 100);

        list.size();
        // internally it is calling Arrays.toString()
        // System.out.println(list.size());
        for (int i = 1; i <= 10; i++) {
            System.out.println(list.get(i));

        }

    }
}
