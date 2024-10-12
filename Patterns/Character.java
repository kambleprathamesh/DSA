public class Character {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'e'; c++) {
            for (char j = 'a'; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
