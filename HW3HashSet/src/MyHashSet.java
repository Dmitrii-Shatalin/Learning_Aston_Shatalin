import java.util.Arrays;

class MyHashSet<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyHashSet() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void add(T element) {
        if (!contains(element)) {
            if (size == data.length) {
                expandCapacity();
            }
            data[size++] = element;
        }
    }

    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                System.arraycopy(data, i + 1, data, i, size - i - 1);
                size--;
                break;
            }
        }
    }

    private void expandCapacity() {
        data = Arrays.copyOf(data, data.length * 2);
    }
}