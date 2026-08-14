package listTask;

public class MyArrayList<T> implements MyList<T> {
    private T[] elements;
    private int size;

    public MyArrayList() {
        elements = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size == elements.length) {

            T[] newArray = (T[]) new Object[elements.length * 2];

            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }

            elements = newArray;
        }
        elements[size] = element;
        size++;

    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;

    }

    @Override
    public int size() {
        return size;
    }
}
