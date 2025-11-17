import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackOnQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public void push (int x) {
        queue2.offer(x);

        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return queue1.poll();
    }

    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return queue1.peek();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
