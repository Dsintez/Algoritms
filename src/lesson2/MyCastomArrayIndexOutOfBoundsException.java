package lesson2;

public class MyCastomArrayIndexOutOfBoundsException extends RuntimeException{
    public MyCastomArrayIndexOutOfBoundsException(int index, int size) {
        super(String.format("Invalid index %d for array with length %d", index, size));
    }
}
