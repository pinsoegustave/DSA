public class BST<T extends Comparable<? super T>> {

    protected BSTNode<T> root = null;

    public void insert(T t) {
        BSTNode<T> p = null;
        BSTNode<T> prev = null;

        while (p != null) {
            prev = p;
            if (t.compareTo(p.el) < 0) {
                p = p.left;
            } else {
                p = p.right;
            }

        }
        if (root == null) {
            root = new BSTNode<T>(t);
        } else if (t.compareTo(prev.el) < 0) {
             new BSTNode<T>(t);
        }
    }
}
