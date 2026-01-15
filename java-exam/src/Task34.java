public class Task34 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1, 15); // [10, 15, 20]

        System.out.println(list.get(0)); // 10
        System.out.println(list.get(1)); // 15
        System.out.println(list.get(2)); // 20

        list.set(1, 99); // [10, 99, 20]
        System.out.println(list.get(1)); // 99

        list.remove(0); // [99, 20]
        System.out.println(list.size()); // 2
    }
}


class MyArrayList<E> {
    // узел односвязного списка
    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }

    private Node<E> head; // первый элемент списка
    private int size;     // количество элементов

    // Количество элементов
    public int size() {
        return size;
    }

    // Проверка на пустоту
    public boolean isEmpty() {
        return size == 0;
    }

    // Добавить в конец
    public void add(E element) {
        add(size, element);
    }

    // Добавить по индексу [0..size]
    public void add(int index, E element) {
        checkPositionIndex(index); // можно вставлять в конец

        if (index == 0) {
            Node<E> newNode = new Node<>(element);
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> prev = nodeAt(index - 1);
            Node<E> newNode = new Node<>(element);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    // Получить элемент по индексу [0..size-1]
    public E get(int index) {
        checkElementIndex(index);
        return nodeAt(index).value;
    }

    // Заменить элемент по индексу, вернуть старое значение
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> node = nodeAt(index);
        E old = node.value;
        node.value = element;
        return old;
    }

    // Удалить элемент по индексу, вернуть удалённое значение
    public E remove(int index) {
        checkElementIndex(index);

        E removed;
        if (index == 0) {
            removed = head.value;
            head = head.next;
        } else {
            Node<E> prev = nodeAt(index - 1);
            Node<E> toRemove = prev.next;
            removed = toRemove.value;
            prev.next = toRemove.next;
        }
        size--;
        return removed;
    }

    // Вспомогательный метод: вернуть узел по индексу
    private Node<E> nodeAt(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Проверка индекса для доступа к элементу (0..size-1)
    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + size);
        }
    }

    // Проверка индекса для вставки (0..size)
    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + size);
        }
    }
}
