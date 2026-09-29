import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Collections;

public class Homework4 {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();
        int a = 1;
        int b = 2;

        s.push(a);
        s.push(b);

        q.add(a);
        q.add(b);
        b = q.remove();
        a = s.pop();
        s.push(a);
        s.push(b);
        q.add(a);
        q.add(b);

        b = q.remove();
        a = s.pop();
        s.push(a + b);
        q.add(2*a);
        s.push(a);
        q.add(a+b);

        while (!s.isEmpty()) {
            a = s.pop();
            System.out.println(a);
        }
        while (!q.isEmpty()) {
            b = q.remove();
            System.out.println(b);
        }

    }
}
