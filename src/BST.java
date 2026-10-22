public class BST<T extends Comparable<? super T>> {

    protected BSTNode<T> root = null;

    public void insert(T t) {
        BSTNode<T> p = root;
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

    public T search(T t) {
        BSTNode<T> p = root;

        while (p != null) {
            if (t.equals(p.el)) {
                return p.el;
            }
            else if (t.compareTo(p.el) < 0) {
                p = p.left;
            }
            else {
                p = p.right;
            }
        }
        return null;
    }

    public void print() {
        print(root, 0);
    }

    public void print (BSTNode<T> p, int depth) {
        if (p != null) {
            print(p.right, depth +1);

            for (int i = 1; i <= depth; i++) {
                System.out.println(" ");
            }
            System.out.println(p.el);

        }
    }
}
