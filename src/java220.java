public class java220 {

    public static void main(String[] args) {

        int x = 1;

        for (int i = 1; i < 32; i++) {
            System.out.println("2^" + i + " = "+ x);
            x*=2;
        }
    }
}
