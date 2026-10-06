import java.util.LinkedList;
import java.util.Scanner;

public class Program4DLL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the level ");
        int level = s.nextInt();

        Fraction f1 = new Fraction(0,1);
        Fraction f2 = new Fraction(1,1);

        F1 list1 = new F1();
        list1.addToHead(f2);
        list1.addToHead(f1);
        list1.ffraction(level);

        System.out.println("F1 list ");
        list1.print();

        F2 list2 = new F2();
        list2.add(f1);
        list2.add(f2);
        list2.ffraction1(level);

        System.out.println("F2 list ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i) + " ");
        }
    }
}

class Fraction {
    public int num;
    public int den;

    public Fraction(int numerator, int denominator) {
        num = numerator;
        den = denominator;
    }
    public int getNum() {
        return num;
    }
    public int getDen() {
        return den;
    }
    public String toString() {
        return num + "/" + den;
    }
}

class F1 extends DLL<Fraction> {
    public void ffraction(int n) {
        DLLNode<Fraction> p = head;

        while (p.next != null) {
            Fraction f1 = p.info;
            Fraction f2 = p.next.info;

            if (f1.den + f2.den <= n) {
                Fraction temp = new Fraction(f1.num + f2.num, f1.den + f2.den);
                DLLNode<Fraction> node = new DLLNode<Fraction>(temp, p, p.next);

                p.next = node;
                p = node;
            } else {
                p = p.next;
            }
        }
    }
}

class F2 extends LinkedList<Fraction> {
    public void ffraction1(int m) {
        int size = this.size();
        int i = 0;

        while (i < size - 1) {
            Fraction f1 = get(i);
            Fraction f2 = get(i + 1);

            if (f1.den + f2.den <= m) {
                Fraction f = new Fraction(f1.num + f2.num, f1.den + f2.den);
                this.add(i + 2, f);

                size++;
                i++;
            }
            i++;
        }
    }
}