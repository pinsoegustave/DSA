// *******************************************************************
//                  Pinsoe Gustave
//
//              Program #4 DLL due 10/06/2026
//     This program returns the fractions in a LinkedList from formula
//          a+b/c+d at a certain level entered by a user.
//                 It also has DLL implementation.
// *******************************************************************

import java.util.LinkedList;
import java.util.Scanner;

public class Program4DLL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the level ");
        int level = s.nextInt();

        Fraction f1 = new Fraction(0,1);
        Fraction f2 = new Fraction(1,1);

        F1 list = new F1();
        list.addToHead(f2);
        list.addToHead(f1);
        list.ffraction(level);

        System.out.println("From F1 function: ");
        list.print();

        F2 list2 = new F2();
        list2.add(f1);
        list2.add(f2);
        list2.ffraction1(level);

        System.out.println("From F2 function: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i) + " ");
        }
        System.out.println();
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
        for (int pos = 2; pos <= n; pos++) {
            DLLNode<Fraction> p = head;
            while (p != null && p.next != null) {
                Fraction f1 = p.info;
                Fraction f2 = p.next.info;

                if (f1.den + f2.den <= pos) {
                    Fraction temp = new Fraction(f1.num + f2.num, f1.den + f2.den);
                    DLLNode<Fraction> node = new DLLNode<Fraction>(temp, p.next, p);

                    if (p.next != null) {
                        p.next.prev = node;
                    }
                    p.next = node;
                    p = node;
                } else {
                    p = p.next;
                }
            }
        }
    }
}

class F2 extends LinkedList<Fraction> {
    public void ffraction1(int m) {
        int i = 0;
        for (int level = 2; level <= m; level++) {
            while (i < size() - 1) {   // use size() to return the total number of elements stored in LinkedList
                Fraction f1 = get(i);
                Fraction f2 = get(i + 1);

                if (f1.den + f2.den <= m) {
                    Fraction f = new Fraction(f1.num + f2.num, f1.den + f2.den);
                    this.add(i + 1, f);  // insert between position i and i+1
                    i = i + 2;
                }  else {
                    i++;
                }
            }
        }

    }
}