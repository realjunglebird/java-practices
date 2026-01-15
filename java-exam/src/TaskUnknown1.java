import java.util.Scanner;

public class TaskUnknown1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;

        System.out.println("Введите текст построчно. Пустая строка завершит ввод.");

        while (true) {
            String line = scanner.nextLine();   // считываем строку

            // если пустая строка, завершаем ввод
            if (line.trim().isEmpty()) {
                break;
            }

            // разделяем строку на слова
            String[] words = line.trim().split("\\s+");

            // добавляем полученное число слов к счётчику
            wordCount += words.length;
        }

        System.out.println("Количество слов: " + wordCount);
    }
}
