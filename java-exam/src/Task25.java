import java.util.Arrays;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        TemperatureAnalyser analyser = new TemperatureAnalyser();

        analyser.enterValues();
        analyser.printValues();
        analyser.printStats();
    }
}

class TemperatureAnalyser {
    private int[] values;

    public TemperatureAnalyser() {
        values = new int[7];
    }

    public void enterValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения температуры по дням: ");
        for (int i = 0; i < 7; i++) {
            System.out.print("День " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }
    }

    public int getMin() {
        return Arrays.stream(values).min().getAsInt();
    }

    public int getMax() {
        return Arrays.stream(values).max().getAsInt();
    }

    public double countAverage() {
        return Arrays.stream(values).average().orElse(0.0);
    }

    public void printValues() {
        System.out.println("Температура по дням:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("День " + (i + 1) + ": " + values[i] + "°C");
        }
    }

    public void printStats() {
        System.out.println("Статистика по темературе:");
        System.out.println("Среднее значение: " + countAverage());
        System.out.println("Максимальное значение: " + getMax());
        System.out.println("Минимальное значение: " + getMin());
    }
}
