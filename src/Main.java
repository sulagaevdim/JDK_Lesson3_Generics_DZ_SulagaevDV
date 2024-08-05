import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1 - Калькулятор
        System.out.println(Calculator.sum(6.2, 3));
        System.out.println(Calculator.multiply(4.5f, 5));
        System.out.println(Calculator.divide(11, 1.0));
        System.out.println(Calculator.subtract(20, 2.5));
        System.out.println();

        // Задание 2 - Сравнение массивов
        Float[] arr1 = {1.0f, 2.0f, 3.0f};
        Double[] arr2 = {1.0, 2.0, 3.0};
        Integer[] arr3 = {1, 2, 3};
        Integer[] arr4 = {1, 2, 3};
        Integer[] arr5 = {4, 5, 6};
        System.out.println(CompareArrays.compare(arr1, arr2));
        System.out.println(CompareArrays.compare(arr2, arr3));
        System.out.println(CompareArrays.compare(arr3, arr4));
        System.out.println(CompareArrays.compare(arr4, arr5));
        System.out.println();

        // Задание 3 - пара значений разного типа Pair
        Pair<Integer, String> pair = new Pair<>(33, "богатыря");
        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}