package dzq;


/**
 * 动态规划，剪绳子
 */
public class Practise_07 {

    public static void main(String[] args) {
        //最后一刀，最大的长度

        int sum = cut1(11);

        System.out.println(sum);

    }


    //非递归
    private static int cut(int n) {
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

    //递归
    private static int cut1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        int max = 0;
        for (int i = 1; i <= n / 2; i++) {
            int result = i * cut1(n - i);
            max = result > max ? result : max;
        }
        return max;
    }


}
