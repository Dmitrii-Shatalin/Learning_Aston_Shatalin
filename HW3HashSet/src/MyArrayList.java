import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
    }

    public void addAll(MyArrayList<T> other) {
        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
}
