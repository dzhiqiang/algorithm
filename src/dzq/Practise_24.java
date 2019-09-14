package dzq;


import static jdk.nashorn.internal.objects.Global.print;

/**
 * 和为s的2个数字
 */
public class Practise_24 {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printSum(ints, 15);
    }

    private static void printSum(int[] ints, int n) {
        int length = ints.length;
        int start = 0;
        while (start < length - 1) {
            int sum = ints[start] + ints[length - 1];
            if (sum == n) {
                System.out.println("first = " + ints[start]);
                System.out.println("second = " + ints[length - 1]);
                break;
            }
            if (sum < n) {
                start++;
                continue;
            }
            if (sum > n) {
                length--;
            }
        }
    }


}
