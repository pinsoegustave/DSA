public class GeometricSequence {
    private int a;
    private int r;
    private int n = 0;

    public GeometricSequence(int a, int r) {
        this.a = a;
        this.r = r;
        n = 0;
    }

    public void nextTerm() {
        n++;
    }
    public double value() {
        return a * Math.pow(r, n);
    }
    void reset() {
        n = 0;
    }

    public boolean equals(Object o) {
        GeometricSequence gs = (GeometricSequence) o;
        return a == gs.a && r == gs.r && n == gs.n;
    }

    public String toString() {
        return "a="+a+" r="+r+" n="+n + ", value="+value();
    }

    public static void main(String[] args) {
        GeometricSequence gs = new GeometricSequence(2,3);
        System.out.println(gs.value());
        gs.nextTerm();
        System.out.println(gs.value());
        gs.nextTerm();
        System.out.println(gs.value());
        gs.reset();
        System.out.println(gs.value());
        System.out.println(gs.toString());
    }
}

