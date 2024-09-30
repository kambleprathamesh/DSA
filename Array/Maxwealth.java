public class Maxwealth {
    public static void main(String[] args) {
        int[][] acc = {
                { 30, 50, 20 }, { 50, 50, 50 }, { 100, 300, 200 }
        };
        int Maxwealth = Richest1(acc);
        System.out.println("Maxwealth " + Maxwealth);

    }

    static int Richest(int[][] acc) {
        int max = 0;
        for (int[] wealth : acc) {
            int totalWealth = findTotalWealth(wealth);
            if (totalWealth > max) {
                max = totalWealth;
            }
        }
        return max;
    };

    static int findTotalWealth(int[] wealth) {
        int totalwealth = 0;
        for (int amount : wealth) {
            totalwealth += amount;
        }
        return totalwealth;
    }

    static int Richest1(int[][] acc) {
        int max = 0;
        for (int row = 0; row < acc.length; row++) {
            int totalWealth = findTotalWealth1(acc[row]);
            if (totalWealth > max) {
                max = totalWealth;
            }
        }
        return max;
    };

    static int findTotalWealth1(int[] wealth) {
        int totalwealth = 0;
        for (int i = 0; i < wealth.length; i++) {
            totalwealth += wealth[i];
        }
        return totalwealth;
    }
}
