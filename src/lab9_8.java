import java.util.ArrayList;
import java.util.Vector;

public class lab9_8 {

    public static void main(String[] args) {
//        D<int, String> d  = new D<int, String>(); this is not allowed, as int can be used only in declaration
//        D<Integer, String> d  = new D<Integer, String>();
        D<Integer, String> d = new D<>();   // diamond operator, since Java 6

        int a = 7;
        Integer aa = 8;
        aa = a;    // same as;
//        aa = new Integer(a);
        a = aa;   // same as:
        a = aa.intValue();
        String b = new String("ABC");
//        f(a, b);
        Integer[] bb = new Integer[10];
        d.f(aa, bb);

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(123);
        Vector<Integer> v = new Vector<>();
    }
}

class D<T, T2> {
    int n = 5;
    T t;
    T2 t2;
//    T t3 = new T;
//    T[] t4 = new T[10];
    T[] t5;

    T f(T tt, T[] t1) {
        T t3 = tt;
        t1[0] = t3;
        return tt;
    }
}