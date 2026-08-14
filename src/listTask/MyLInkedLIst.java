package listTask;

public class MyLInkedLIst <T> implements MyList<T> {

    private Node<T> first;
    private int size;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (first == null) {
            first = newNode;
        } else {

            Node<T> current = first;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;

    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            first = first.next;
        } else {

            Node<T> current = first;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;

    }

    @Override
    public int size() {
        return size;
    }
}
