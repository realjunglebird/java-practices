import java.util.ArrayList;

public class GenericStackInheritance<T> extends ArrayList<T> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return get(getSize() - 1);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return remove(getSize() - 1);
    }

    public void push(T o) {
        add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
