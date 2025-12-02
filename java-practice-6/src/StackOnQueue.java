import java.util.Queue;
import java.util.ArrayDeque;

public class StackOnQueue {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public StackOnQueue() {
        main = new ArrayDeque<Integer>();
        helper = new ArrayDeque<Integer>();
    }

    @Override
    public String toString() {
        return main.toString();
    }

    public boolean empty() {
        return main.isEmpty();
    }

    public int pop() {
        return main.poll();
    }

    public int top() {
        return main.peek();
    }

    public void push (int x) {
        helper.offer(x);

        while (!main.isEmpty()) {
            helper.offer(main.poll());
        }

        while (!helper.isEmpty()) {
            main.offer(helper.poll());
        }
    }
}