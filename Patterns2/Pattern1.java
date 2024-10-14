public class Pattern1 {
    public static void main(String[] args) {
        // p1(5, 5);
        p10(5);
    }

    // static void p1(int rows, int cols) {
    // for (int i = 0; i <= rows; i++) {
    // for (int j = 0; j <= cols; j++) {
    // if (i == 0 || i == cols || j == 0 || j == cols) {
    // System.out.print("");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    static void p2(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p3(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void p4(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    static void p5(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void p6(int n) {
        // 1st half code
        for (int i = 1; i <= n; i++) {

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half code
        for (int i = n; i >= 0; i--) {

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void p7(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int stars = 1; stars <= n; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p8(int n) {

        for (int i = 1; i <= n; i++) {

            // space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p9(int n) {

        for (int i = 1; i <= n; i++) {
            // space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // 2nd half code
        for (int i = n; i >= 0; i--) {
            // space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // stars

            System.out.print("*");

            // space
            for (int space = 1; space <= 2 * i - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

    static void p10(int n) {

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
