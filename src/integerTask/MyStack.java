package integerTask;

public class MyStack<T> {
    private Object[] arr = new Object[10];
    private int count = 0;

    public void set(T value) {
        arr[count] = value;
        count++;
    }

    public T get() {
        T first = (T) arr[0];
        for (int i = 0; i < count - 1; i++) {
            arr[i] = arr[i+1];
        }
        count--;
        return first;
    }


}