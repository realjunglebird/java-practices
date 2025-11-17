public class GenericStackComposition<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;

    public GenericStackComposition() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements[size - 1];
    }

    public void push(T o) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = o;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        T o = elements[--size];
        elements[size] = null;
        return o;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: [");
        for (int i = 0; i < size; ++i) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
