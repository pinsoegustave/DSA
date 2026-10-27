public class test {
    public static void main(String[] args) {
        printNum(1);
    }

    private static void printNum(int a) {
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (a == 5) {
                    break;
                }
                System.out.println(i * j);
            }
        }
    }
}
