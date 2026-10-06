public class Factorial {
    public static void main(String[] args) {
        f(3);
    }

        static void f(int n) {
            if (n > 0) {
                f(n-1);
                System.out.println(n + "");
                f(n-1);
            }
        }

}
