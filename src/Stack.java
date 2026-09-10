import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> pool = new ArrayList<>();

    public void push(T el) {
        pool.add(el);
    }

    public T pop() {
//        if (pool.isEmpty()) {
//            return null;
//        }
        return pool.remove(pool.size()-1);
    }

    public T topEl() {
        return pool.get(pool.size()-1);
    }

    public boolean isEmpty() {
        return pool.isEmpty();
    }

    public String toString() {
        return pool.toString();
    }

    public void clear() {
        pool.clear();
    }
}
