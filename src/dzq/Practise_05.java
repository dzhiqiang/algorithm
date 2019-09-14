package dzq;


import dzq.common.BinaryStrTreeNode;

/**
 * 找出数组中重复的数组
 * 递归的三个条件
 * 1：循环体
 * 3：终止条件
 */
public class Practise_05 {

    public static void main(String[] args) {

        BinaryStrTreeNode root = new BinaryStrTreeNode("a");
        BinaryStrTreeNode b = new BinaryStrTreeNode("b");
        BinaryStrTreeNode c = new BinaryStrTreeNode("c");
        BinaryStrTreeNode d = new BinaryStrTreeNode("d");
        BinaryStrTreeNode e = new BinaryStrTreeNode("e");
        BinaryStrTreeNode f = new BinaryStrTreeNode("f");
        BinaryStrTreeNode g = new BinaryStrTreeNode("g");
        BinaryStrTreeNode h = new BinaryStrTreeNode("h");
        BinaryStrTreeNode i = new BinaryStrTreeNode("i");
        root.setLeft(b);
        root.setRigth(c);
        b.setParent(root);
        c.setParent(root);
        b.setLeft(d);
        b.setRigth(e);
        d.setParent(b);
        e.setParent(b);
        c.setLeft(f);
        c.setRigth(g);
        f.setParent(c);
        g.setParent(c);
        e.setLeft(h);
        e.setRigth(i);
        h.setParent(e);
        i.setParent(e);

        BinaryStrTreeNode node = nextNode(d);
        System.out.println(node.getKey());
    }

    private static BinaryStrTreeNode nextNode(BinaryStrTreeNode node) {
        if (node.getRigth() != null) {
            return getLeftNode(node.getRigth());
        }

        BinaryStrTreeNode parentNode = node.getParent();
        if (parentNode == null ) {
            return node;
        }
        if (parentNode.getLeft() != null && parentNode.getLeft().getKey().equals(node.getKey())) {
            return parentNode;
        }

        if (parentNode.getRigth() != null && parentNode.getRigth().getKey().equals(node.getKey())) {

            return getParentAndleft(node,parentNode);

        }

        return null;
    }

    private static BinaryStrTreeNode getParentAndleft(BinaryStrTreeNode node,BinaryStrTreeNode parent) {
        BinaryStrTreeNode parentParent = parent.getParent();
        if (parentParent == null) {
            return node;
        }
        if (parentParent.getLeft().getKey() == parent.getKey()) {
            return parentParent;
        }
        return getParentAndleft(parent, parentParent);
    }

    private static BinaryStrTreeNode getLeftNode(BinaryStrTreeNode node) {
        if (node.getLeft() != null) {
            return getLeftNode(node.getLeft());
        }
        return node;
    }


}
