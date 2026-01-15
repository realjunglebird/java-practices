import java.util.Scanner;

public class Task27 {

    // вспомогательный метод для подсчёта нужных пар
    public static int countPositiveBeforeNegative(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > 0 && numbers[i + 1] < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов (N > 1):");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Ошибка: последовательность должна содержать более одного элемента.");
            return;
        }

        int[] sequence = new int[n];
        System.out.println("Введите " + n + " целых чисел:");

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int result = countPositiveBeforeNegative(sequence);
        System.out.println("Количество положительных чисел, за которыми следует отрицательное: " + result);

        // пример с предопределённым массивом
        int[] predefined = {1, 2, -3, 4, 5, -6, 7, -8};
        System.out.println("Пример с предопределённым массивом:");
        System.out.println("Результат: " + countPositiveBeforeNegative(predefined));
    }
}
