import java.util.Stack;

public class Task19 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        s2.push(1);
        s2.push(2);
        s2.push(3);

        System.out.println(equals(s1, s2));
        System.out.println(s1);
        System.out.println(s2);
    }

    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> helper = new Stack<>();
        boolean equal = true;

        // сравниваем, одновременно сохраняя элементы во вспомогательный стек
        while (!s1.isEmpty() && !s2.isEmpty()) {
            int a = s1.pop();
            int b = s2.pop();
            helper.push(a);
            helper.push(b);

            if (a != b) {
                equal = false;
                break;
            }
        }

        // если один из стеков все ешё не пуст, а другой пуст - они не равны
        if (!s1.isEmpty() || !s2.isEmpty()) {
            equal = false;
        }

        // восстанавливаем исходное состояние стеков
        while (!helper.isEmpty()) {
            int a = helper.pop();
            int b = helper.pop();
            s2.push(b);
            s1.push(a);
        }
        return equal;
    }
}
