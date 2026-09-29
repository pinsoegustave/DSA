public class DLLNode<T> {
    public T info;
    public DLLNode<T> next, prev;

    public DLLNode(T t, DLLNode<T> n, DLLNode<T> p) {
        info = t;
        next = n;
        prev = p;
    }

    public DLLNode(T t) {
        this(t, null, null);
    }
}
