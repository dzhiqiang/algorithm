package dzq;


/**
 * 位运算
 */
public class Practise_08 {

    public static void main(String[] args) {

        int count = count1(15);
        System.out.println(count);

    }

    private static int count(int n) {
        //6
        //110

        int flag = 1;
        int count = 0;
        while (flag != 0) {
            if ((n&flag) != 0) {
                count++;
            }
            flag <<= 1;
        }
        return count;
    }

    private static int count1(int n) {

        int count = 0;
        while (n != 0) {

            count++;
            n = (n - 1) & n;

        }
        return count;
    }

}
