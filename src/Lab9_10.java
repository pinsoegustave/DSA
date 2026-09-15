public class Lab9_10 {

    <T> void printStack(Stack<T> s) {
        Stack<T> t = new Stack<>();
        while (!s.isEmpty()) {
            t.push(s.pop());
            System.out.print(t.topEl() + " ");
        }
        System.out.println();
        while (!t.isEmpty()) {
            s.push(t.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Lab9_10 lab = new Lab9_10();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        lab.printStack(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
