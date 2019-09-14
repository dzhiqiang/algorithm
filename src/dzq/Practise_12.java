package dzq;


import dzq.common.ListNode;

/**
 * 找到倒数k节点的node
 */
public class Practise_12 {

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        root.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        ListNode b = getLastNode(root, 5);
        System.out.println(b.getKey());
    }

    private static ListNode getLastNode(ListNode root, int k) {

        ListNode a = root;
        ListNode b = root;

        for (int i = 0; i < k-1; i++) {
            b = b.getNext();
        }

        while (b.getNext() != null) {
            a = a.getNext();
            b = b.getNext();
        }

        return a;
    }


}
