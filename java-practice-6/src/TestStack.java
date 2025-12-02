public class TestStack {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        System.out.println("Созданный пустой стек:");
        System.out.println("Стек: " + stack.toString());

        stack.push(10);
        stack.push(20);

        System.out.println("После добавления 10 и 20:");
        System.out.println("Стек: " + stack.toString());

        System.out.println("Просмотр элемента на вершина стека: " + stack.top());

        System.out.println("Удаление элемента на вершине стека: " + stack.pop());

        System.out.println("Пуст ли стек: " + stack.empty());

        System.out.println("Стек: " + stack.toString());

        System.out.println("Удаление оставшегося элемента: " + stack.pop());
        System.out.println("Пуст ли стек: " + stack.empty());
        System.out.println("Стек: " + stack.toString());
    }
}
