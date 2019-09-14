package dzq;


/**
 * 数组中找出2个只出现一次的数字，其余出现2次
 */
public class Practise_23 {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 1, 2, 3, 5,3,4,4,10,5,11};
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result = result ^ ints[i];
        }

        int firstIndexOf = getFirstIndexOf(result);
        int num1 = 0, num2 = 0;
        for (int i = 0; i < ints.length; i++) {
            if (isFirst(ints[i], firstIndexOf)) {
                num1 ^= ints[i];
            } else {
                num2 ^= ints[i];
            }
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

    private static boolean isFirst(int anInt, int firstIndexOf) {
        return ((anInt >> firstIndexOf) & 1 )== 1;
    }

    private static int getFirstIndexOf(int result) {
        int index = 0;
        while ((result&1) == 0) {
            result >>= 1;
            index++;
        }
        return index;
    }


}
