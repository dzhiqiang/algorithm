package dzq;


import dzq.common.BinaryIntTreeNode;

/**
 * 顺时针打印矩阵
 */
public class Practise_16 {

    public static void main(String[] args) {

        int[][] ints = new int[][]
                {{1,2,3,4,7,8}
                ,{2,3,4,5,6,9}
                ,{3,4,7,8,9,11}
                ,{4,6,8,10,11,15}};
        int start = 0;
        int columns = ints[0].length;
        int rows = ints.length;
        while (start * 2 < columns && start * 2 < rows) {
            printCycle(ints, columns, rows, start);
            start++;
        }

    }

    public static void printCycle(int[][] ints,int columns,int rows,int start) {

        int endX = columns - start - 1;
        int endY = rows - start - 1;

        for (int i = start; i <= endX; i++) {
            System.out.println(ints[start][i]);
        }
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                System.out.println(ints[i][endX]);
            }
        }
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.println(ints[endY][i]);
            }
        }

        if (start < endY - 1 && start < endX) {
            for (int i = endY - 1; i > start; i--) {
                System.out.println(ints[i][start]);
            }
        }
    }

}
