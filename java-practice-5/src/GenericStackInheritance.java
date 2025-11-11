import java.util.ArrayList;

public class GenericStackInheritance<E> extends ArrayList<E> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return get(getSize() - 1);
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return remove(getSize() - 1);
    }

    public void push(E o) {
        add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
