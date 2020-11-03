package BasicW4Q6;
public class StackFullException extends RuntimeException {
    public StackFullException() {
        super("Stack is full");
    }
}