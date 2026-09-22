public class Lab9_22 {
    public static void main(String[] args) {
        SLL<Integer> sll = new SLL<>();

        sll.addToHead(10);
        sll.addToHead(20);
        sll.addToHead(30);
        sll.print();

        SLL<Integer> sll2 = new SLL<>();
        sll2.addToTail(10);
        sll2.addToTail(20);
        sll2.addToTail(30);
        sll2.print();

    }
}
