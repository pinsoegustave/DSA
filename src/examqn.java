import java.util.Queue;

public class examqn {
    public static void main(String[] args) {

        Stack<Integer> S = new Stack<>();
//        Queue<Integer> Q = new Queue<>();

        int a = 4;
        int b = 1;
        int c = 3;

        S.push(a);
//        Q.enqueue(2*b);
        S.push(b);
//        Q.enqueue(b);
//        a = Q.dequeue();
        S.push(a);
        b = S.pop();
        S.push(a - b);
        c = S.pop();
//        Q.enqueue(b + c);
//        Q.enqueue(a + c);
        S.push(a);
        S.push(2 * b);
        S.push(b - c);

        while (!S.isEmpty()) {
            a = (S.pop());
            System.out.println(a + " ");
        }
        while (!S.isEmpty()) {  // has to be Q
//            b = Q.dequeue();
            System.out.println(b + " ");
        }
        System.out.println(a + " "+b+" "+c);

    }
}
