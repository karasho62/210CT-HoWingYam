package BasicW4Q7;

public class QueueFullException extends RuntimeException {

    public QueueFullException() {
        super("Queue is Full");
    }
}
