package dzq;


import dzq.common.ListNode;

/**
 * 环链表的入口节点
 */
public class Practise_13 {

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
        node4.setNext(node1);


        ListNode b = getCycleNode(root);

        System.out.println(b.getKey());
    }

    private static ListNode getCycleNode(ListNode root) {

        ListNode a = root;
        ListNode b = root;
        while (a != null && a.getNext() != null) {
            a = a.getNext().getNext();
            b = b.getNext();
            if (a == b) {
                break;
            }
        }
        if (a == null || a.getNext() == null) {
            return null;
        }
        b = root;
        while (a != b) {
            a = a.getNext();
            b = b.getNext();
        }
        return b;

    }


}
