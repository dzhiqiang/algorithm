package dzq;


import dzq.common.BinaryStrTreeNode;

/**
 * 菲波那切数列
 * 青蛙跳台
 */
public class Practise_06 {

    public static void main(String[] args) {
        //1,1,2,3,5,8,13
        int sum = result1(5);
        System.out.println(sum);
    }



    private static int result(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return result(n - 1) + result(n - 2);
    }
    //非递归
    private static int result1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int result = 2;
        for (int i = 3; i <= n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }

}
