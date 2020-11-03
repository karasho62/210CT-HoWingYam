package BasicW3Q4Q5;
public class EmptyListException extends RuntimeException {
    public EmptyListException() {
        super("List is empty");
    }
}