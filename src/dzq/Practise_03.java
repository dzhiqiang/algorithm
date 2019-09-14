package dzq;

/**
 * 找到二维数组中的值
 */
public class Practise_03 {

    public static void main(String[] args) {

        int[][] ints = new int[][]{{1,2,3,4,7,8}
                                  ,{2,3,4,5,6,9}
                                  ,{3,4,7,8,9,11}
                                  ,{4,6,8,10,11,15}};

        System.out.println(search(ints,11));

    }
    //从右上角开始
    public static int search(int[][] ints,int a) {
        int rows = ints.length;
        int columns = ints[0].length;
        for (int i = 0; i < ints.length; i++) {
            for (int j = columns - 1; j >= 0; j--) {
                if (ints[i][j] == a) {
                    return a;
                }
                if (ints[i][j] > a) {
                    continue;
                }
                if (ints[i][j] < a) {
                    break;
                }
            }
        }

        return 0;
    }


}
