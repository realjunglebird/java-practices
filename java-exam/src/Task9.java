import java.util.*;

public class Task9 {
    // подробное тестирование
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.toString());

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.toString());

        queue.enqueue(46);
        queue.enqueue(453);

        System.out.println(queue.toString());

        queue.dequeue();

        System.out.println(queue.toString());
    }
}

class Queue<T> {
    private List<T> elements;

    public Queue() {
        elements = new ArrayList<T>();
    }

    public void enqueue(T element) {
        elements.add(element);
    }

    public void dequeue() {
        elements.removeFirst();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
