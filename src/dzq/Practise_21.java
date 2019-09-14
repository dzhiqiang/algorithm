package dzq;


/**
 * 礼物的最大值
 */
public class Practise_21 {

    public static void main(String[] args) {

        int[][] ints = new int[][]
                {{1,2,3,4,7,8}
                ,{2,3,4,5,6,9}
                ,{3,17,7,8,9,11}
                ,{4,6,8,10,11,15}};

        int max = max(ints);
        System.out.println(max);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j <ints[i].length; j++) {
                System.out.print(ints[i][j]+",");
            }
            System.out.println();
        }
    }

    private static int max(int[][] ints) {

        int maxX = ints[0].length;
        int maxY = ints.length;

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j <ints[i].length; j++) {
                int value = ints[i][j];
                if (i - 1 >= 0 && j - 1 >= 0) {
                    ints[i][j] = ints[i - 1][j] > ints[i][j - 1] ? ints[i - 1][j] + value : ints[i][j - 1] + value;
                } else if (i - 1 >= 0) {
                    ints[i][j] = ints[i - 1][j] + value;
                } else if (j - 1 >= 0) {
                    ints[i][j] = ints[i][j - 1] + value;
                } else {
                    ints[i][j] = value;
                }
            }
        }

        return ints[maxY - 1][maxX - 1];
    }


}
