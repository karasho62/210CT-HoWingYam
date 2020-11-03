package BasicW4Q6;

public class StackEmptyException extends RuntimeException {

    public StackEmptyException() {
        super("Stack is empty");
    }
}
