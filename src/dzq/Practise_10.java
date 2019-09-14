package dzq;


import dzq.common.ListNode;

import java.util.List;

/**
 * 删除节点
 */
public class Practise_10 {

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
        Practise_04.print(root);
        deleteNode(root, node3);
        Practise_04.print(root);
    }

    private static void deleteNode(ListNode root, ListNode listNode) {

        ListNode next = listNode.getNext();

        listNode.setKey(next.getKey());
        listNode.setNext(next.getNext());

        next.setNext(null);

    }


}
