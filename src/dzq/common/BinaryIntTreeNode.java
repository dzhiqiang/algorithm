package dzq.common;

public class BinaryIntTreeNode {

    private int key;
    private BinaryIntTreeNode left;
    private BinaryIntTreeNode rigth;

    private BinaryStrTreeNode parent;

    public BinaryStrTreeNode getParent() {
        return parent;
    }

    public void setParent(BinaryStrTreeNode parent) {
        this.parent = parent;
    }

    public BinaryIntTreeNode(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BinaryIntTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryIntTreeNode left) {
        this.left = left;
    }

    public BinaryIntTreeNode getRigth() {
        return rigth;
    }

    public void setRigth(BinaryIntTreeNode rigth) {
        this.rigth = rigth;
    }
}
