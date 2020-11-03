package BasicW4Q7;

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException() {
        super("Queue is empty");
    }
}
