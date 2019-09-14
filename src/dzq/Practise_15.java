package dzq;


import dzq.common.BinaryIntTreeNode;

/**
 * 判断一个树是否镜像
 */
public class Practise_15 {

    public static void main(String[] args) {

        BinaryIntTreeNode node1 = new BinaryIntTreeNode(1);
        BinaryIntTreeNode node2 = new BinaryIntTreeNode(2);
        BinaryIntTreeNode node3 = new BinaryIntTreeNode(2);
//        BinaryIntTreeNode node4 = new BinaryIntTreeNode(4);
        node1.setLeft(node2);
        node1.setRigth(node3);
//        node2.setLeft(node4);

        boolean symmetrical = isSymmetrical(node1, node1);
        System.out.println(symmetrical);

    }

    private static boolean isSymmetrical(BinaryIntTreeNode node1,BinaryIntTreeNode node2) {

        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        //值相等 && 左节点等于右节点 && 右节点等于左节点
        return node1.getKey() == node2.getKey() && isSymmetrical(node1.getLeft(), node2.getRigth()) && isSymmetrical(node1.getRigth(), node2.getLeft());
    }


}
