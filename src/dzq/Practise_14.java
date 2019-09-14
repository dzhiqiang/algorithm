package dzq;


import dzq.common.BinaryIntTreeNode;
import dzq.common.ListNode;

/**
 * 树的镜像
 */
public class Practise_14 {

    public static void main(String[] args) {

        BinaryIntTreeNode node1 = new BinaryIntTreeNode(1);
        BinaryIntTreeNode node2 = new BinaryIntTreeNode(2);
        BinaryIntTreeNode node3 = new BinaryIntTreeNode(3);
        BinaryIntTreeNode node4 = new BinaryIntTreeNode(4);
        node1.setLeft(node2);
        node1.setRigth(node3);
        node2.setLeft(node4);

        mirror(node1);

    }

    public static void mirror(BinaryIntTreeNode root) {
        BinaryIntTreeNode left = root.getLeft();
        BinaryIntTreeNode right = root.getRigth();

        BinaryIntTreeNode temp = left;
        left = right;
        right = temp;
        if (left != null) {
            mirror(left);
        }
        if (right != null) {
            mirror(right);
        }
    }

}
