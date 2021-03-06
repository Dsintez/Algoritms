package lesson3.mystak;

public class StackImpl<E> implements Stack<E> {

    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public StackImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
    }

    //O(1)
    @Override
    public void push(E value) {
        data[size++] = value;
    }

    @Override
    public E pop() {
        return data[--size];
    }

    //O(1)
    @Override
    public E peek() {
        return data[size - 1];
    }

    //O(1)
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
}
