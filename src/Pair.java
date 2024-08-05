public class Pair<T, U> {
    private final T one;
    private final U two;

    public Pair(T one, U two) {
        this.one = one;
        this.two = two;
    }
    public T getFirst() {
        return one;
    }
    public U getSecond() {
        return two;
    }
    @Override
    public String toString() {
        return "(" + one + ", " + two + ")";
    }
}