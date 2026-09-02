
public class Lab8_27 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println(r1.length);
        r1.length = 12.34;
        System.out.println(r1.length);
        Rectangle r2 = new Rectangle(1.2, 3.4), r3 = new Rectangle(1.2, 3.4), r4 = r3;
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r4.toString());
        System.out.println(r2 == r3);
        System.out.println(r2 == r4);
        System.out.println(r2.equals(r3));

        Square s = new Square(5.6), sq = new Square(5.6);
        System.out.println(s);
        System.out.println(s.equals(sq));

        Rectangle r5 = new Rectangle(10, 20);
        System.out.println(r5.returnLarger(r1));
        System.out.println(r1.returnLarger(r5));

//        I i = new I();

        CI ci = new CI();
        ci.g();
        ci.f();

        CStatic cs1 = new CStatic();
        System.out.println(cs1);
        CStatic cs2 = new CStatic();
        System.out.println(cs1);
        System.out.println(cs2);
        cs1.n = 13;
        cs2.n = 15;
//        CStatic.n = 20; illegal piece of code because of Ambiguity
        CStatic.m = 40;
        cs1.m = 50;
        cs2.m = 60;
    }

//    class Rectangle extends Object
    public static class Rectangle {
    double length, width;

    Rectangle() {

    }

    public Rectangle(double ln, double w) {
        length = ln;
        width = w;
    }

    @Override
    public String toString() {
        return length + " / " + width;
    }

    @Override
    public boolean equals(Object r) {
        return length == ((Rectangle) r).length && width == ((Rectangle) r).width;
    }

    double area() {
        return length * width;
    }
    Rectangle returnLarger(Rectangle r){
        if (area() > r.area()) {
            return this;
        } else {
            return r;
        }
    }
}

static class Square extends Rectangle {
        Square(double s) {
            length = width = s;
        }

        public String toString() {
//            System.out.println(super.toString());
            return "side = " +  length;
        }

    }

    interface I {
        int n = 5;     // the word "final" is implicit
        void g(); // the word "public" is implicit
        default void f() {
            System.out.println("function f()");
        }
    }

    static class CI implements I {
        public void g() {    // "public" is explicit
//            n = 15;   // n is a constant
            System.out.println("method g()");
        }
    }

    static class CStatic {
        int n = 0;
        static int m = 9;
        CStatic() {
            n++;
            m++;
        }
        public String toString() {
            return "n = " + n + " and m = " + m;
        }
    }
}
