package dzq.common;

public class BinaryStrTreeNode {

    private String key;
    private BinaryStrTreeNode left;
    private BinaryStrTreeNode rigth;
    private BinaryStrTreeNode parent;

    public BinaryStrTreeNode getParent() {
        return parent;
    }

    public void setParent(BinaryStrTreeNode parent) {
        this.parent = parent;
    }

    public BinaryStrTreeNode(String key) {
        this.key = key;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BinaryStrTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryStrTreeNode left) {
        this.left = left;
    }

    public BinaryStrTreeNode getRigth() {
        return rigth;
    }

    public void setRigth(BinaryStrTreeNode rigth) {
        this.rigth = rigth;
    }
}
