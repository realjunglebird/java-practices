import java.util.Arrays;

public class Task10 {
    // подробное тестирование
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);

        System.out.println(array);

        array.remove(4);

        System.out.println(array);
        System.out.println(array.get(3));
        System.out.println(array.get(1));
        System.out.println(array.get(5)); // выбросит исключение тк индекс слишком большой
    }
}

class Array<T> {
    Object[] elements;
    int size;
    int capacity;

    public Array() {
        size = 0;
        capacity = 1;
        elements = new Object[capacity];
    }

    public void add(T element) {
        if (size == capacity) {
            resize();
        }
        elements[size++] = element;
    }

    public void remove(int index) {
        // если индекс невалиден
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        // смещаем все последующие элементы назад
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public T get(int index) {
        // если индекс невалиден
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        return (T) elements[index];
    }

    private void resize() {
        capacity *= 2;
        Object[] newElements = new Object[capacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}