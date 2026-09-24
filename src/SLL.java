public class SLL<T> {

    protected SLLNode<T> head = null, tail = null;

    public boolean isEmpty() {
        return head == null;
    }
    public void addToHead(T el) {
        head = new SLLNode<>(el, head);
        if (tail == null) {
            tail = head;
        } else {
            tail.next = head;
        }
    }

    public void addToTail(T el) {
        if (!isEmpty()) {
            tail.next = new SLLNode<>(el);
            tail = tail.next;
        }
        else {
            head = tail = new SLLNode<>(el, head);
        }
    }

    public T deleteFromHead() {
        if (isEmpty()) {
            return null;
        }
        T t = head.info;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return t;
    }

    public T deleteFromTail() {
        if (isEmpty()) {           // if list is empty;
            return null;
        }
        T t = tail.info;
        if (head == tail) {        // if there is only one node;
            head = tail = null;
        } else {
            SLLNode<T> p;
            for ( p = head; p.next.next != null; p = p.next) {
                tail = p;
                p.next = null;
            }
        }
        return t;
    }

    public void print() {
        for (SLLNode<T> p = head; p != null; p = p.next) {
            System.out.print(p.info + " ");
        }
            System.out.println();
    }
}
// When would that be illegal: At least if we have one node on