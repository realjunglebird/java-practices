import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task33 {
    // перечисление режимов фильтрации
    enum Mode {
        STANDART {
            @Override
            public boolean include(int number) {
                return true;
            }
        },
        EVEN {
            @Override
            public boolean include(int number) {
                return number % 2 == 0;
            }
        },
        UNEVEN {
            @Override
            public boolean include(int number) {
                return number % 2 != 0;
            }
        };

        public abstract boolean include(int number);
    }

    // генерация последовательности Фибоначчи до заданного предела
    public static List<Integer> generateFibonacci(int limit) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;

        while (a <= limit) {
            sequence.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return sequence;
    }

    // применение фильтрации по режиму
    public static List<Integer> filterFibonacci(List<Integer> sequence, Mode mode) {
        List<Integer> filtered = new ArrayList<>();

        for (int num : sequence) {
            if (mode.include(num)) {
                filtered.add(num);
            }
        }
        return filtered;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предел последовательности Фибоначчи: ");
        int limit = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Выберите режим (STANDART, EVEN, UNEVEN): ");
        String modeInput = scanner.nextLine().trim().toUpperCase();

        Mode mode;
        try {
            mode = Mode.valueOf(modeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный режим. Используется STANDART.");
            mode = Mode.STANDART;
        }

        List<Integer> sequence = generateFibonacci(limit);
        List<Integer> result = filterFibonacci(sequence, mode);

        System.out.printf("%s числа последовательности Фибоначчи до %d: %s%n",
                mode.name().charAt(0) + mode.name().substring(1).toLowerCase(),
                limit,
                result.toString().replaceAll("[\\[\\]]", ""));
    }
}
