import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class TaskUnknown3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(0);
        s.push(-1);
        s.push(5);
        s.push(-6);
        s.push(-3);
        s.push(2);
        s.push(7);

        splitStack(s);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    // метод разбивает стек на отрицательные (снизу) и неотрицательные (сверху)
    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();

        // считаем, сколько отрицательных элементов
        int negativesCount = 0;

        // перекладываем все элементы из стека в очередь
        while (!s.isEmpty()) {
            int value = s.pop();
            if (value < 0) {
                negativesCount++;
            }
            q.add(value);
        }

        // сначала возвращаем в стек все отрицательные элементы
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int value = q.remove();
            if (value < 0) {
                s.push(value);
            } else {
                q.add(value); // неотрицательные пока что крутим в очереди
            }
        }

        // затем добавляем все неотрицательные сверху
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}
