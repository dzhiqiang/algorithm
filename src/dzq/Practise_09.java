package dzq;


/**
 * 数值的整数次方
 */
public class Practise_09 {

    public static void main(String[] args) {

        int count = count2(2,6);
        System.out.println(count);

    }

    private static int count(int value, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * value;
        }
        return result;
    }

    private static int count1(int value, int n) {
        if (value == 0) {
            return 1;
        }
        if (value == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * value;
        }
        return result;
    }

    private static int count2(int value, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return value;
        }

        int result = count2(value, n >> 1);
        result = result * result;
        if (n % 2 == 1) {
            result = result * value;
        }
        return result;
    }



}
