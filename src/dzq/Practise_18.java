package dzq;


import dzq.common.BinaryIntTreeNode;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 从上到下打印二叉树
 */
public class Practise_18 {

    public static void main(String[] args) throws InterruptedException {

        BinaryIntTreeNode node1 = new BinaryIntTreeNode(1);
        BinaryIntTreeNode node2 = new BinaryIntTreeNode(2);
        BinaryIntTreeNode node3 = new BinaryIntTreeNode(2);
        BinaryIntTreeNode node4 = new BinaryIntTreeNode(4);
        node1.setLeft(node2);
        node1.setRigth(node3);
        node2.setLeft(node4);

        printUpToDown(node1);

    }

    private static void printUpToDown(BinaryIntTreeNode root) throws InterruptedException {

        LinkedBlockingQueue<BinaryIntTreeNode> queue = new LinkedBlockingQueue<>();
        queue.put(root);
        while (queue.peek() != null) {
            BinaryIntTreeNode current = queue.poll();
            System.out.println(current.getKey());
            if (current.getLeft() != null) {
                queue.put(current.getLeft());
            }
            if (current.getRigth() != null) {
                queue.put(current.getRigth());
            }
        }
    }


}
