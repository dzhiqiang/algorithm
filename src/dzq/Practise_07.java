package dzq;


/**
 * 动态规划，剪绳子
 */
public class Practise_07 {

    public static void main(String[] args) {
        //最后一刀，最大的长度

        int sum = cut(8);

        System.out.println(sum);

    }

    private static int cut(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;

        for (int i = 4; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {

                int sum = j * result[i - j];
                if (sum > max) {
                    max = sum;
                }
            }
            result[i] = max;
        }

        return result[n];
    }


}
