package dzq;

/**
 * 找出数组中重复的数字
 */
public class Practise_02 {

    public static void main(String[] args) {

        int[] ints = new int[]{2,3,3,1,2,3};

        System.out.println(search1(ints));

    }
    //创建一个额外的数组
    public static int search(int[] ints) {

        if (ints == null || ints.length == 0) {
            return 0;
        }
        int[] emp = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            int j = ints[i];
            if (emp[j] != 0) {
                return j;
            }
            emp[j] = 1;
        }
        return 0;
    }

    //修改数组的值
    public static int search1(int[] ints) {

        if (ints == null || ints.length == 0) {
            return 0;
        }
        for (int i = 0; i < ints.length; i++) {
            while (i != ints[i]) {
                int j = ints[i];
                if (ints[j] == j) {
                    return j;
                }
                int temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
            }
        }
        return 0;
    }


}
