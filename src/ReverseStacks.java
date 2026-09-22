import java.util.Stack;

public class ReverseStacks {

    // METHOD 1: Reverse using TWO additional stacks (T1 and T2)
    public static void reverseTwoStacks(Stack<String> S) {
        Stack<String> T1 = new Stack<>();
        Stack<String> T2 = new Stack<>();

        // Step 1: Move everything from S to T1
        while (!S.isEmpty()) {
            T1.push(S.pop());
        }

        // Step 2: Move everything from T1 to T2
        while (!T1.isEmpty()) {
            T2.push(T1.pop());
        }

        // Step 3: Move everything from T2 back to S
        while (!T2.isEmpty()) {
            S.push(T2.pop());
        }
    }

    // METHOD 2: Reverse using ONE additional stack + variables

    // Insert x at the bottom of stack T using only scalar variables
    public static void insertAtBottom(Stack<String> T, String x) {
        // Base case: T is empty, so x goes here (the bottom)
        if (T.isEmpty()) {
            T.push(x);
            return;
        }

        // Otherwise, hold the top in a variable, recurse, then restore
        String temp = T.pop();
        insertAtBottom(T, x);
        T.push(temp);
    }

    // Reverse stack S using one auxiliary stack T and scalar variables
    public static void reverseOneStack(Stack<String> S) {
        Stack<String> T = new Stack<>();

        // Pop each element from S and insert it at the bottom of T
        while (!S.isEmpty()) {
            String x = S.pop();
            insertAtBottom(T, x);
        }

        // Move everything from T back to S
        while (!T.isEmpty()) {
            S.push(T.pop());
        }
    }

    // ============================================================
    // MAIN: Test both methods
    // ============================================================
    public static void main(String[] args) {

        // ---------- Test Method 1 ----------
        Stack<String> S1 = new Stack<>();
        S1.push("D");
        S1.push("C");
        S1.push("B");
        S1.push("A");   // A on top

        System.out.println("=== Method 1: Two Additional Stacks ===");
        System.out.println("Before reverse: " + S1);
        reverseTwoStacks(S1);
        System.out.println("After reverse:  " + S1);
        System.out.println();

        // ---------- Test Method 2 ----------
        Stack<String> S2 = new Stack<>();
        S2.push("D");
        S2.push("C");
        S2.push("B");
        S2.push("A");   // A on top

        System.out.println("=== Method 2: One Additional Stack + Scalars ===");
        System.out.println("Before reverse: " + S2);
        reverseOneStack(S2);
        System.out.println("After reverse:  " + S2);
    }
}