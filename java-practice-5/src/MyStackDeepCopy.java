import java.util.ArrayList;

public class MyStackDeepCopy extends ArrayList<Object> {
    public MyStackDeepCopy(MyStackDeepCopy other) {
        for (Object item : other) {
            this.push(item);
        }
    }

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
        return get(getSize() - 1);
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

    public MyStackDeepCopy deepCopy() {
        return new MyStackDeepCopy(this);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
