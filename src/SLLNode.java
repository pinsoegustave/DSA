public class SLLNode<T> {

    public T info;
    public SLLNode<T> next;

    public SLLNode(T el, SLLNode<T> p) {
        info = el;
        next = p;
    }

    public SLLNode(T el) {
//        SLLNode(el, null);
        this(el, null);
    }

    public SLLNode() {
        this(null, null);
    }
}
