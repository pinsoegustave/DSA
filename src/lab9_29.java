import java.util.LinkedList;

public class lab9_29 {
    public static void main(String[] args) {
        DLL<Integer> dll = new DLL<>();
        dll.addToHead(10);
        dll.print();
        dll.addToHead(20);
        dll.print();
        dll.addToHead(30);
        dll.print();

        System.out.println(dll.deleteFromTail());
        dll.print();
        System.out.println(dll.deleteFromTail());
        dll.print();
        System.out.println(dll.deleteFromTail());
        dll.print();
        System.out.println(dll.deleteFromTail());
        dll.print();

        LinkedList<Integer> lst = new LinkedList<Integer>();
        lst.add(44);
        lst.add(55);
        lst.add(66);
        System.out.println(lst);
        System.out.println(lst.get(0));
        System.out.println(lst.remove(0) + " " + lst);
        lst.add(1, 77);
        System.out.println(lst);
        System.out.println(dll);   // This returns the memory address of the linked list
    }
}
