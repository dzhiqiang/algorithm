package dzq;


/**
 * 动态规划，剪绳子
 */
public class Practise_07_1 {

    public static void main(String[] args) {

        int[][] ints = new int[][]{{500, 5}, {200, 3}, {300, 4}, {350, 3}, {400, 5}, {900, 2}};

        System.out.println(getMaxMoney(ints, 0, 10));
        System.out.println(getMaxMoney1(ints, 10));


    }

    public static int getMaxMoney(int[][] ints, int length, int n) {
        if (length >= ints.length) {
            return 0;
        }
        int money = ints[length][0];
        int person = ints[length][1];
        if (person > n) {
            return getMaxMoney(ints, length + 1, n);
        }
        int max = money + getMaxMoney(ints, length + 1, n - person);
        int max1 = getMaxMoney(ints, length + 1, n);
        return max > max1 ? max : max1;
    }

    public static int getMaxMoney1(int[][] ints, int n) {
        int[][] array = new int[ints.length + 1][n + 1];


        for (int i = 1; i <= ints.length; i++) {
            for (int j = 1; j <= n; j++) {
                int money = ints[i-1][0];
                int person = ints[i-1][1];
                if (person > j) {
                    array[i][j] = array[i - 1][j];
                } else {
                    int max = money + array[i - 1][j - person];
                    int max1 = array[i - 1][j];
                    array[i][j] = max > max1 ? max : max1;
                }
            }
        }
        return array[ints.length][n];
    }


}
