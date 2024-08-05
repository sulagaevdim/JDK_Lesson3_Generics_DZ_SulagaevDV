public class Calculator {
    public static <T extends Number, U extends Number> String sum(T a, U b) {
        return a + " + " + b + " = " + (a.doubleValue() + b.doubleValue());
    }
    public static <T extends Number, U extends Number> String multiply(T a, U b) {
        return a + " * " + b + " = " + (a.doubleValue() * b.doubleValue());
    }
    public static <T extends Number, U extends Number> String divide(T a, U b) {
        if (b.doubleValue() == 0) System.out.println("Division by zero");
        return a + " / " + b + " = " + a.doubleValue() / b.doubleValue();
    }
    public static <T extends Number, U extends Number> String subtract(T a, U b) {
        return a + " - " + b + " = " + (a.doubleValue() - b.doubleValue());
    }
}