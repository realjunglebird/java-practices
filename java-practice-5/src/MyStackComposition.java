import java.util.ArrayList;

public class MyStackComposition {
    private ArrayList<Object> list;

    public MyStackComposition() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}
