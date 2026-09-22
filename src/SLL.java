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
    public void print() {
        for (SLLNode<T> p = head; p != null; p = p.next) {
            System.out.print(p.info + " ");
        }
            System.out.println();
    }
}
// When would that be illegal: At least if we have one node on