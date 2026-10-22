public class lab10_15 {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(20);
        bst.insert(30);
        bst.insert(25);
        bst.insert(10);
        bst.insert(15);
        bst.insert(27);

        bst.print();

        System.out.println("search: "+ bst.search(25));
        System.out.println("search: "+ bst.search(30));
        System.out.println("search: "+ bst.search(28));

        BST<D2> d = new BST<D2>();
        d.insert(new D2(12, "abc"));
        d.insert(new D2(10, "pqr"));
        d.insert(new D2(15, "ABC"));
        d.print();
        D2 d1 = new D2(12, "abc");
        D2 d2 = new D2(13, "PQR");
        System.out.println("search: "+ d.search(d1));
        System.out.println("search: "+ d.search(d2));
    }
}

class D2 implements Comparable<D2> {
    int id;
    String name;
    D2 (int i, String s) {
        id = i;
        name = s;
    }

    @Override
    public int compareTo(D2 o) {
        if (id == o.id) {
            return 0;
        } else if (id < o.id) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public String toString() {
        return id + "/" + name;
    }

    public boolean equals(D2 d) {
        return id == d.id;
    }

    public boolean equals(Object d) {
        return id == ((D2)d).id;
    }
}