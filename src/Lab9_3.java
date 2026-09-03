public class Lab9_3 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

    class A {
        public int k = 1;
        int m = 2;    // package
        protected int n = 3;
        private int p = 4;

        public String toString() {
            return "A: k = " + k + " n = " + n + " m = " + m + " p = " + p;
        }
    }

    class B extends A {
        public int k = 11;
        int m = 12;
        protected int n = 13;
        private int p = 14;

        public String toString() {
            return "B: k = " + k + " n = " + n + " m = " + m + " p = " + p;
        }
    }

    class C extends A {
        C() {
            k = 21;
            m = 22;
            n = 23;
//            p = 24;  p is private in A, cannot be accessed directly without a getter
        }
        public String toString() {
            return "C: k = " + k + " n = " + n + " m = " + m + " p = not accessible";
        }
    }
