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

//        dll.print();
    }
}
