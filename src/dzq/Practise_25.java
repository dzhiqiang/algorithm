package dzq;


/**
 * 约瑟夫环
 * 0 1 2 3 4 5 6 7
 *       0 1 2 3 4
 * 5 6         0 1
 * 2 3   4 5
 *   0   1 2   3 4
 *             0 1
 *   2   3
 *       0     1 2
 *       0     1
 *             0
 */
public class Practise_25 {

    public static void main(String[] args) {

        System.out.println(getIndex(10,3));

    }

    public static int getIndex(int n, int m) {
        int index = 0;
        for (int i = 2; i <= n; i++) {
            index = (index + m) % i;
        }
        return index;
    }


}
