public class TestStack {
    public static void main(String[] args) {
        StackOnQueues stack = new StackOnQueues();

        stack.push(10);
        stack.push(20);

        System.out.println("После добавления 10 и 20:");
        System.out.println("Стек: " + stack.toString());

        System.out.println("Вершина стека (top): " + stack.top());

        System.out.println("Удалённый элемент (pop): " + stack.pop());

        System.out.println("Стек пуст? " + stack.empty());

        System.out.println("Все элементы стека: " + stack.toString());

        System.out.println("Удаляем последний элемент: " + stack.pop());
        System.out.println("Стек пуст после удаления всех элементов? " + stack.empty());
    }
}
