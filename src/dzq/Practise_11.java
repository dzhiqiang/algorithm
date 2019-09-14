package dzq;


import dzq.common.ListNode;

/**
 * 调整奇数偶数位置
 */
public class Practise_11 {

    public static void main(String[] args) {

        int[] ints = new int[]{1,3,4,5,73,234,1232,657,5,14,214};

        recordOddEven(ints);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static void recordOddEven(int[] ints) {

        int i = 0;
        int j = ints.length - 1;
        while (i < j) {

            if (ints[i] % 2 == 1 && ints[j] % 2 == 0) {
                int temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
                i++;
                j--;
                continue;
            }
            if (ints[i] % 2 == 0) {
                i++;
            }
            if (ints[j] % 2 == 1) {
                j--;
            }
        }
    }

}
