public class DSExam {
    public static void main(String[] args) {
        C3 c3 = new C3();
        C5 c5 = new C5();
        c3.display();
        c5.display();
    }
}

class C1 {
    public int m = 1;
//    private int n = 2;   // making this variable private, means it can't be changed after wards. (can't be inherited)
    protected int n = 2;
    public void display() {
        System.out.println(m+" "+n);
    }
}

class C2 extends C1 {
    public int m = 11;
    private int n = 12;
    public void display() {
        System.out.println(m+" "+n);
        super.display();
    }
}

class C3 extends C2 {
    public int m = 21;
    private int n = 22;
    public void display() {
        System.out.println(m+" "+n);
        super.display();
    }
}

class C4 extends C1 {
    public C4() {
        m = 31;
        n = 32;   // this won't work, since n is private in class C1
    }
    public void display() {
        System.out.println(m+" "+n);
        super.display();
    }
}
class C5 extends C4 {
    public C5() {
        m = 41;
        n = 42;  // same as in C4, n can't be changed since its private in its parent class
    }
    public void display() {
        System.out.println(m+" "+n);
        super.display();
    }
}
