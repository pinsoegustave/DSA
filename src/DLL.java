
public class DLL<T> {
    protected DLLNode<T> head = null, tail = null;

    public boolean isEmpty() {
        return head == null;
    }
    public void addToHead(T t) {
        if (!isEmpty()) {
            head = new DLLNode<T>(t, head, null);
            head.next.prev = head;
        }
        else head = tail = new DLLNode<T>(t,head, tail);
    }

    public T deleteFromTail() {
        if (!isEmpty()) {
            return null;
        }
        T t = tail.info;
        if (head == tail) {
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return t;
    }

    public void print() {
        for (DLLNode<T> p = head; p != null; p = p.next) {
            System.out.println(p.info + " ");
        }
        System.out.println();
    }
}