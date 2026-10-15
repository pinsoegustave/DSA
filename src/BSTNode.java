public class BSTNode<T extends Comparable<? super T>> {

        protected T el;
        protected BSTNode<T> left;
        protected BSTNode<T> right;

    public BSTNode(T t, BSTNode<T> lt, BSTNode<T> rt) {
        el = t;
        left = lt;
        right = rt;
    }
    public BSTNode(T t) {
        this(t, null, null);
    }
    public BSTNode() {
        this(null, null, null);
    }

}
