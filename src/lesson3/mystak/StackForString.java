package lesson3.mystak;

public class StackForString{
    private StackImpl<Character> stack;

    public StackForString(String str) {
        stack = new StackImpl<>(str.length());
        int index = 0;
        while (!stack.isFull()) {
            stack.push(str.charAt(index++));
        }
    }

    public String reverse() {
        StringBuilder reverse = new StringBuilder();
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
