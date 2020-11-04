package lesson3.deque;

public interface Deque<E>{

    boolean insertRight(E value);
    boolean insertLeft(E value);

    E removeRight();
    E removeLeft();

    E peekRight();
    E peekLeft();

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    boolean isFull();
}
