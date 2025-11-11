import java.util.ArrayList;

public class MyStackInheritance extends ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return get(getSize());
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return remove(getSize() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
