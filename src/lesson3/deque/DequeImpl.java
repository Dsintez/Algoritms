package lesson3.deque;

public class DequeImpl<E> implements Deque<E> {

    private final int DEFAULT_LEFT = -1;
    private final int DEFAULT_RIGHT;
    private final E[] data;
    private int size;

    private int posRight;
    private int posLeft;

    @SuppressWarnings("unchecked")
    public DequeImpl(int maxValue) {
        this.data = (E[]) new Object[maxValue];
        DEFAULT_RIGHT = maxValue;
        posLeft = DEFAULT_RIGHT;
        posRight = DEFAULT_LEFT;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }
        if (posRight == DEFAULT_RIGHT - 1) {
            posRight = DEFAULT_LEFT;
        }

        data[++posRight] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (posLeft == DEFAULT_LEFT + 1) {
            posLeft = DEFAULT_RIGHT;
        }

        data[--posLeft] = value;
        size++;
        return true;
    }

    @Override
    public E removeRight() {
        if (posRight == DEFAULT_RIGHT) {
            posRight--;
        }
        E removed = data[posRight--];
        size--;
        if (posRight == DEFAULT_LEFT) {
            posRight = DEFAULT_RIGHT;
        }
        return removed;
    }

    @Override
    public E removeLeft() {
        if (posLeft == DEFAULT_LEFT) {
            posLeft++;
        }
        E removed = data[posLeft++];
        size--;
        if (posLeft == DEFAULT_RIGHT) {
            posLeft = DEFAULT_LEFT;
        }
        return removed;
    }

    @Override
    public E peekRight() {
        return data[posRight];
    }

    @Override
    public E peekLeft() {
        return data[posLeft];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return data.length == size;
    }
}
