public class Car<E> {
    public int num = 12;
    private E[] e = (E[]) new Object[]{1, 2, 3};
    private String name = "";

    public <E> Car()/*<E>*/ {
        super();
        return;
    }

    public E E(E E) {
        return E;
    }

}
