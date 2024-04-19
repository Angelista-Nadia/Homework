import java.util.stream.IntStream;

public class NumberStream {
    public static void main(String[] args) {
        // Найти среднее значение первых 10 чисел
        double average = IntStream.iterate(1, i -> i + 1).limit(10).average().getAsDouble();
        System.out.println("Среднее значение первых 10 чисел: " + average);

        // Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка
        IntStream.iterate(6, i -> i + 1).filter(num -> num % 3 == 0).limit(10).forEach(System.out::println);

        // Посчитать сумму 20 вподряд идущих чисел
        int sum = IntStream.iterate(1, i -> i + 1).limit(20).sum();
        System.out.println("Сумма 20 вподряд идущих чисел: " + sum);
    }
}
