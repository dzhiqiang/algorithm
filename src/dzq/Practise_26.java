package dzq;


/**
 * 不用加减乘除做加法
 * 100 10001
 * 他们的值就相当于异或的结果10101=21 x ^ y
 * 5 + 17   12 + 10
 * 101 10001
 * 异或：    10110  22
 *
 */
public class Practise_26 {

    public static void main(String[] args) {

        System.out.println(sum(12, 18));

    }

    private static int sum(int x, int y) {
        int sum;
        int carry;
        do {
            sum = x ^ y;
            carry = (x & y) << 1;
            x = sum;
            y = carry;
        } while (y != 0);
        return sum;
    }

}
