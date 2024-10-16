import java.util.*;

public class Dysarium {
    public static void main(String[] args) {

        System.out.println(DY(89));
    }

    static boolean DY(int num) {
        String Snum = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < Snum.length(); i++) {
            char Rno = Snum.charAt(i);
            int no =  Rno-'0';
            System.out.println(no);
            double powerValue = Math.pow(no, i+1);
            sum += powerValue;

        }
        System.out.println(sum);

        if (sum == num) {
            return true;
        }

        return false;
    }
}
