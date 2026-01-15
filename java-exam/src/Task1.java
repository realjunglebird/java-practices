import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Task1 {
    public static void process(InputStream input, PrintStream output) {
        Scanner scanner = new Scanner(input);               // сканер ввода
        List<List<Integer>> allLines = new ArrayList<>();   // список со всеми строками

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                List<Integer> numbers = new ArrayList<>();  // создаем список из Integer
                Scanner lineScanner = new Scanner(line);    // создаём отдельный сканер для анализа введённой строки
                while (lineScanner.hasNextInt()) {      // пока в строке есть int'ы
                    numbers.add(lineScanner.nextInt()); // добавляем следующий Integer в список
                }
                Collections.reverse(numbers);   // сразу разворачиваем наш список
                allLines.add(numbers);          // добавляем получившуюся "строку чисел" в список строк
            } else {
                break;  // если строка пуста, заканчиваем ввод
            }
        }

        Collections.reverse(allLines);  // разворачиваем список всех введённых строк

        // выводим строки, в каждой числа через пробел
        for (List<Integer> line : allLines) {
            for (int i = 0; i < line.size(); i++) {
                if (i > 0) output.print(" ");
                output.print(line.get(i));
            }
            output.println();
        }
    }

    public static void main(String[] args) {
        process(System.in, System.out);
    }
}

