public class Star {
    public static void main(String args[]) {
        // for (int i = 0; i <= 4; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println(" ");
        // }\

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print("*" + " ");
        // }
        // System.out.println(" ");
        // }

        // print sum of n prime numbers
        int sum = 0;
        for (int i = 1; i <= 50; i++) {

            for (int j = 1; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    
                }
            }
        }
        System.out.println("Sum of first 50 prime numbers is " + sum);

    }

}