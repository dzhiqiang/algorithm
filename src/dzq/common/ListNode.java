package dzq.common;

public class ListNode {

    private int key;
    private ListNode next;

    public ListNode(int key) {
        this.key = key;
    }
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
