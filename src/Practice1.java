public class Practice1 {
    public static void main(String[] args) {

    }

    public void insertThird(DLL<Integer> lst, int value) {
//        special case 1:
        if (lst.head == null) {
            System.out.println("List is empty");
        }
//        special case 2:
        if (lst.head.next == null) {
            System.out.println("List has only 1 node");
        }
//        special case 3:
        if (lst.head.next.next == null) {
            DLLNode<Integer> newNode = new DLLNode<>(value, null, lst.head.next);
            lst.head.next.next = newNode;
            return;
        }
//        special case 4:
        DLLNode<Integer> second = lst.head.next;
        DLLNode<Integer> third = lst.head.next.next;

        DLLNode<Integer> newNode = new DLLNode<>(value, second, third);

        second.next = newNode;
        third.next = newNode;
    }

}
