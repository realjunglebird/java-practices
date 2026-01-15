public class TaskUnknown4 {
    public static void main(String[] args) {
        String input = "Пример строки";
        char[] chars = input.toCharArray();

        // переворачиваем строку вручную
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        String reversed = new String(chars);
        System.out.println("Перевёрнутая строка: " + reversed);
    }
}
