package dzq;

import dzq.common.ListNode;


/**
 * 找出数组中重复的数组
 * 递归的三个条件
 * 1：循环体
 * 2：终止条件
 */
public class Practise_04 {

    public static void main(String[] args) {
        ListNode root = new ListNode(2);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        root.setNext(node1);
        node1.setNext(node2);
        print(root);

    }

    //递归
    public static void print(ListNode root) {

        if (root.getNext() != null) {
            print(root.getNext());
        }
        System.out.println(root.getKey());

    }


}
