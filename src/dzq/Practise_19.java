package dzq;


import dzq.common.BinaryIntTreeNode;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 连续子数组的最大和
 */
public class Practise_19 {

    public static void main(String[] args) {

        int[] ints = new int[]{1, -2, 23, -10, 11};

        int max = getMax(ints);

        System.out.println(max);
    }

    private static int getMax(int[] ints) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < ints.length; i++) {
            int value = ints[i];
            current = current + value <= value ? value : current + value;
            max = current > max ? current : max;
        }
        return max;
    }


}
